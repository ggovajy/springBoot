package com.example.demo.ggova.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.example.demo.ggova.service.ggovaService;
import com.example.demo.ggova.service.dao.ggovaDAO;

@Service
public class ggovaServiceImpl implements ggovaService {

	@Resource(name = "ggovaDAO")
	ggovaDAO ggovaDao;
	
	@Override
	public List<Map> ggovaTest(HttpServletRequest request, ModelMap model){
		// TODO Auto-generated method stub
		
		Map map = new HashMap();
		
		System.out.println("test 3333");
		List<Map> result = ggovaDao.ggovaTest(map);
		System.out.println("test 4444");
		return result;
	}

	@Override
	public String loginExcute(HttpServletRequest request, ModelMap model) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void ggovaUpdate(Map param, HttpServletRequest request, ModelMap model){
		// TODO Auto-generated method stub
		
		System.out.println("test 3333");
		ggovaDao.ggovaUpdate(param);
		System.out.println("test 4444");
	}
	
	@Override
	public void ggovaDelete(Map param, HttpServletRequest request, ModelMap model){
		// TODO Auto-generated method stub
		
		System.out.println("test 3333");
		ggovaDao.ggovaDelete(param);
		System.out.println("test 4444");
	}

}