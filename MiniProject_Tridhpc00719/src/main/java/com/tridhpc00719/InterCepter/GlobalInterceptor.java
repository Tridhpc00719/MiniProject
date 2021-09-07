package com.tridhpc00719.InterCepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.tridhpc00719.Service.CategoryService;

@Component
public class GlobalInterceptor implements HandlerInterceptor {
	@Autowired
	CategoryService categoryservice;
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		request.setAttribute("cates", categoryservice.findAll());
	
	}
}