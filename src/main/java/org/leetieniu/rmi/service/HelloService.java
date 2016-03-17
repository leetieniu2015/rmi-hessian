package org.leetieniu.rmi.service;

import java.rmi.Remote;

public interface HelloService extends Remote {

	public String sayHello(String str) throws java.rmi.RemoteException;

}
