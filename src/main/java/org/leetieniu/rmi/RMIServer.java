package org.leetieniu.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import org.leetieniu.rmi.service.HelloService;
import org.leetieniu.rmi.service.impl.HelloServiceImpl;

public class RMIServer {

	public static void main(String[] args) {
		try {
			//java.rmi.server.hostname的设置必须在服务对象创建之前
			System.setProperty("java.rmi.server.hostname", "localhost");
			// 实例化实现了IService接口的远程服务ServiceImpl对象
			HelloService service = new HelloServiceImpl();
			
			LocateRegistry.createRegistry(8808);  
	        Naming.rebind("rmi://localhost:8808/hello", service);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("服务器向命名表注册了1个远程服务对象！");
	}
}
