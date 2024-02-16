package com.fullstack.aop.bean;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Notification {
	
	@AfterReturning("execution(* submit*(..))")
	public void notifyOfSubmittedOrder(JoinPoint joinPoint) {
		System.out.println("[AfterReturn] order was submitted by calling " + joinPoint.getSignature().getName());
		
	}

}
