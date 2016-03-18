package org.leetieniu.hessan;

import java.net.MalformedURLException;

import org.leetieniu.hessan.service.HessianHelloService;

import com.caucho.hessian.client.HessianProxyFactory;

public class HessanClient {

	public static void main(String[] args) throws MalformedURLException {  
        // Hessian代理工厂  
        HessianProxyFactory factory = new HessianProxyFactory();  
        // 访问配置的Servlet路径  
        String url = "http://localhost:8080/rmi-hessian/helloHessian";  
  
        // 使用Hessian工厂获得接口的具体实现类  
        HessianHelloService hessianHelloService = (HessianHelloService) factory.create(HessianHelloService.class, url);  
  
        System.out.println(hessianHelloService.sayHello("word!"));  
    }  
}
