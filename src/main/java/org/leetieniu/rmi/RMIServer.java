package org.leetieniu.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import org.leetieniu.rmi.service.RMIHelloService;
import org.leetieniu.rmi.service.impl.RMIHelloServiceImpl;

public class RMIServer {

	public static void main(String[] args) {
		try {
			//java.rmi.server.hostname的设置必须在服务对象创建之前
			System.setProperty("java.rmi.server.hostname", "localhost");
			// 实例化实现了IService接口的远程服务ServiceImpl对象
			RMIHelloService service = new RMIHelloServiceImpl();
			
			LocateRegistry.createRegistry(8808);  
	        Naming.rebind("rmi://localhost:8808/helloRMI", service);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("服务器向命名表注册了1个远程服务对象！");
	}
}
