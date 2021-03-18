package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;


@SpringBootApplication
public class TestMybatisApplication {
	
    @Autowired
    MongoTemplate mongoTemplate;
    
	public static void main(String[] args) {
		SpringApplication.run(TestMybatisApplication.class, args);
	}
	
    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> {
            Account account = new Account();
            account.setEmail("aaa@bbb");
            account.setUsername("aaa");
            System.out.println("test!!!!@@@");

            mongoTemplate.insert(account);

            System.out.println("finished");
        };
    }
}
