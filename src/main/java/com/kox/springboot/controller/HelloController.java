/**
 * 
 */
package com.kox.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kox.springboot.constants.ApplicationConstants;
import com.kox.springboot.model.ErrorDescription;
import com.kox.springboot.model.HelloRequest;
import com.kox.springboot.model.HelloResponse;
import com.kox.springboot.service.HelloServiceManager;

/**
 * @author KOXKAKKU
 *
 */
@RestController
public class HelloController {

	@Autowired
	private HelloServiceManager helloServiceManager;

	@PostMapping(path = "/greeting")
	public ResponseEntity<HelloResponse> sayHello(@RequestBody HelloRequest helloRequest) {
		HelloResponse helloResponseBody = new HelloResponse();
		ErrorDescription errorDescription;
		HttpStatus httpStatus = HttpStatus.OK;
		try {
			helloResponseBody = helloServiceManager.sayHello(helloRequest);
			helloResponseBody.setResponseStatus(ApplicationConstants.SUCCESS);
		} catch (Exception e) {
			e.printStackTrace();
			errorDescription = new ErrorDescription();
			errorDescription.setErrorCode("01");
			errorDescription.setErrorMessage(e.getMessage());
			helloResponseBody.setResponseStatus(ApplicationConstants.FAILURE);

		}

		return new ResponseEntity<HelloResponse>(helloResponseBody, httpStatus);
	}
}
