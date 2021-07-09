package com.hello01kuaixue;

import java.lang.reflect.Proxy;

public class Test5 {
	public static void main(String[] args) {
		BusinessService target = new BusinessServiceImpl();
		
		BusinessService service = (BusinessService)Proxy.newProxyInstance(
				
				target.getClass().getClassLoader(),
				
				target.getClass().getInterfaces(),
				
			new MyInvocationHandler(target));
		service.transfer();
	}
}
