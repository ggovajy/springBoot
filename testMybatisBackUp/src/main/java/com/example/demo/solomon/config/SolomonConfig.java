package com.example.demo.solomon.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration 
@MapperScan(basePackages = "com.example.demo.solomon.service.dao")
public class SolomonConfig {
	
    @Value("${spring.datasource.driver-class-name}")
    private String dbDriverClassName;
    @Value("${spring.datasource.url}")
    private String dbJdbcUrl;
    
    @Value("${spring.datasource.username}")
    private String dbUsername;
    
    @Value("${spring.datasource.password}")
    private String dbPassword;
	
    @SuppressWarnings("rawtypes")
	@Bean(name = "dataSource")
    public DataSource dataSource() {
    	DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
    	
    	dataSourceBuilder.driverClassName(dbDriverClassName);
        dataSourceBuilder.url(dbJdbcUrl);
        dataSourceBuilder.username(dbUsername);
        dataSourceBuilder.password(dbPassword);
        return dataSourceBuilder.build();
    }
    
	@Bean 
	public SqlSessionFactory sqlSessionFactory(DataSource datasource) throws Exception { 
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean(); 
		sqlSessionFactory.setDataSource(datasource); 
		sqlSessionFactory.setTypeAliasesPackage("com.example.demo.solomon.service.dao.solomonDAO"); 
		sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/*.xml")); 
		return sqlSessionFactory.getObject(); 
		} 
	@Bean 
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) { 
		return new SqlSessionTemplate(sqlSessionFactory); 
		} 
	}

