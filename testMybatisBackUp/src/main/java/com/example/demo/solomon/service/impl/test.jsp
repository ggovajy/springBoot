package com.example.demo.solomon.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.example.demo.solomon.service.solomonService;
import com.example.demo.solomon.service.dao.solomonDAO;

@Service
public class solomonServiceImpl implements solomonService {

	@Resource(name = "solomonDAO")
	solomonDAO solomonDao;
	
	@Override
	public List<Map> solomonTest(HttpServletRequest request, ModelMap model){
		// TODO Auto-generated method stub
		
		Map map = new HashMap();
		
		System.out.println("test 3333");
		List<Map> result = solomonDao.solomonTest(map);
		System.out.println("test 4444");
		return result;
	}

	@Override
	public String loginExcute(HttpServletRequest request, ModelMap model) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void solomonUpdate(Map param, HttpServletRequest request, ModelMap model){
		// TODO Auto-generated method stub
		
		System.out.println("test 3333");
		solomonDao.solomonUpdate(param);
		System.out.println("test 4444");
	}
	
	@Override
	public void solomonDelete(Map param, HttpServletRequest request, ModelMap model){
		// TODO Auto-generated method stub
		
		System.out.println("test 3333");
		solomonDao.solomonDelete(param);
		System.out.println("test 4444");
	}

}