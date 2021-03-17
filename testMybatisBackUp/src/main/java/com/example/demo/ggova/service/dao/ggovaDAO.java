package com.example.demo.ggova.service.dao;

import java.util.List;
import java.util.Map;

public interface ggovaDAO {
	
	public List<Map> login(Map map);
	
	public List<Map> ggovaTest(Map map);
	
	public void ggovaUpdate(Map map);
	
	public void ggovaDelete(Map map);

}
