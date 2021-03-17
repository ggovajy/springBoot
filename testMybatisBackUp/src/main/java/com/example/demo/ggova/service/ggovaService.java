package com.example.demo.ggova.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;

public interface ggovaService {
	public String loginExcute(HttpServletRequest request, ModelMap model) throws Exception ;
	
	public List<Map> ggovaTest(HttpServletRequest request, ModelMap model);
	
	public void ggovaUpdate(Map param, HttpServletRequest request, ModelMap model);
	
	public void ggovaDelete(Map param, HttpServletRequest request, ModelMap model);
}
