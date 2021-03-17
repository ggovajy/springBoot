package com.example.demo.test.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.example.demo.test.service.testService;
import com.example.demo.test.service.dao.testDAO;

@Service
public class testServiceImpl implements testService {

	@Resource(name = "testDAO")
	testDAO testDao;
	
	@Override
	public List<Map> testTest(HttpServletRequest request, ModelMap model){
		// TODO Auto-generated method stub
		
		Map map = new HashMap();
		
		System.out.println("test 3333");
		List<Map> result = testDao.testTest(map);
		System.out.println("test 4444");
		return result;
	}

	@Override
	public String loginExcute(HttpServletRequest request, ModelMap model) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void testUpdate(Map param, HttpServletRequest request, ModelMap model){
		// TODO Auto-generated method stub
		
		System.out.println("test 3333");
		testDao.testUpdate(param);
		System.out.println("test 4444");
	}
	
	@Override
	public void testDelete(Map param, HttpServletRequest request, ModelMap model){
		// TODO Auto-generated method stub
		
		System.out.println("test 3333");
		testDao.testDelete(param);
		System.out.println("test 4444");
	}

}