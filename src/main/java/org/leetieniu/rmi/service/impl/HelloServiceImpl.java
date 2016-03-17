package org.leetieniu.rmi.service.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

import org.leetieniu.rmi.service.HelloService;

public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {
	
	private static final long serialVersionUID = -3549810476643306251L;

	public HelloServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHello(String str) throws RemoteException {
		System.out.println(new Date().toString() + " 收到:" + str);
		return "Hello " + str; 
	}
}
