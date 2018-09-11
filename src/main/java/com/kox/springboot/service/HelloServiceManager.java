/**
 * 
 */
package com.kox.springboot.service;

import com.kox.springboot.model.HelloRequest;
import com.kox.springboot.model.HelloResponse;

/**
 * @author KOXKAKKU
 *
 */
public interface HelloServiceManager {
	/**
	 * service method for sayHello
	 * @param helloRequest
	 * @return HelloResponse
	 * @throws Exception
	 */
	HelloResponse sayHello(HelloRequest helloRequest) throws Exception;
}
