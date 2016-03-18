package org.leetieniu.rmi;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.leetieniu.rmi.service.RMIHelloService;

public class RMIClient {

	public static void main(String[] args) {
		String url = "rmi://localhost:8808/";
		try {
			Context namingContext = new InitialContext();
			// 检索指定的对象。 即找到服务器端相对应的服务对象存根
			RMIHelloService service = (RMIHelloService) namingContext.lookup(url + "helloRMI");
			Class<? extends RMIHelloService> stubClass = service.getClass();
			System.out.println(service + " 是 " + stubClass.getName() + " 的实例！");
			// 获得本底存根已实现的接口类型
			@SuppressWarnings("rawtypes")
			Class[] interfaces = stubClass.getInterfaces();
			for (@SuppressWarnings("rawtypes") Class c : interfaces) {
				System.out.println("存根类实现了 " + c.getName() + " 接口！");
			}
			System.out.println(service.sayHello("world!"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
