package com.fullstack.aop.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class Logging implements AfterReturningAdvice{

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("[AfterRerturning] A purchase was made by calling " + method.getName());
	}

}
