package com.hello01kuaixue;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{
	private Object target;
	
	public MyInvocationHandler() {
		
	}
	
	public MyInvocationHandler(Object target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy,Method method,Object[] args)throws Throwable{
		System.out.println("模拟对转账账户进行安全验证");
		return method.invoke(target, args);
	}
}
