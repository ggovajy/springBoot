package com.example.demo.solomon.service.dao;

import java.util.List;
import java.util.Map;

public interface solomonDAO {
	
	public List<Map> login(Map map);
	
	public List<Map> solomonTest(Map map);
	
	public void solomonUpdate(Map map);
	
	public void solomonDelete(Map map);

}
