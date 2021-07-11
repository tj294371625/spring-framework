package com.chinadaas.entity;

import org.springframework.stereotype.Component;

/**
 * @author liubc
 * @version 1.0.0
 * @description
 * @createTime 2021.07.08
 */
public class AspectHandler {

	public void beforeMethod() {
		System.out.println("前置通知执行");
	}

	public void afterMethod() {
		System.out.println("后置通知执行");
	}
}
