package com.example.demo.test.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;

public interface testService {
	public String loginExcute(HttpServletRequest request, ModelMap model) throws Exception ;
	
	public List<Map> testTest(HttpServletRequest request, ModelMap model);
	
	public void testUpdate(Map param, HttpServletRequest request, ModelMap model);
	
	public void testDelete(Map param, HttpServletRequest request, ModelMap model);
}
