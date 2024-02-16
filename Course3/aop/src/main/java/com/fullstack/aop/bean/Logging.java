package com.fullstack.aop.bean;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class Logging {

	@After("execution(* purchase*(..))")
	public void afterReturning(JoinPoint joinPoint) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("[AfterRerturning] A purchase was made by calling " + joinPoint.getSignature().getName());
	}

	//@Before("execution(* purchaseProduct(..))")
	public void before(JoinPoint joinPoint) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("[MethodBefore] A purchase is about to be made by calling " + joinPoint.getSignature().getName());
	}

}
