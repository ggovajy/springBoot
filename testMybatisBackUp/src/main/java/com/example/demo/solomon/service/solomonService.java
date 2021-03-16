package com.example.demo.solomon.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;

public interface solomonService {
	public String loginExcute(HttpServletRequest request, ModelMap model) throws Exception ;
	
	public List<Map> solomonTest(HttpServletRequest request, ModelMap model);
	
	public void solomonUpdate(Map param, HttpServletRequest request, ModelMap model);
	
	public void solomonDelete(Map param, HttpServletRequest request, ModelMap model);
}
