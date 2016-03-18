package org.leetieniu.hessan.service.impl;

import java.util.Date;

import org.leetieniu.hessan.service.HessianHelloService;

public class HessianHelloServiceImpl implements HessianHelloService {

	@Override
	public String sayHello(String str) {
		System.out.println(new Date().toString() + " 收到:" + str);
		return "Hello " + str; 
	}
}
