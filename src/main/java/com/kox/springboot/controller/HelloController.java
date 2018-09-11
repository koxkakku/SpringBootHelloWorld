/**
 * 
 */
package com.kox.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kox.springboot.constants.ApplicationConstants;
import com.kox.springboot.constants.UrlConstants;
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
	final static Logger log = LoggerFactory.getLogger(HelloController.class);
	
	@Autowired
	private HelloServiceManager helloServiceManager;

	@PostMapping(path = UrlConstants.URL_GREETING)
	public ResponseEntity<HelloResponse> sayHello(@RequestBody HelloRequest helloRequest) {
		HelloResponse helloResponseBody = new HelloResponse();
		ErrorDescription errorDescription;
		HttpStatus httpStatus = HttpStatus.OK;
		try {
			log.debug(helloRequest.toString());
			helloResponseBody = helloServiceManager.sayHello(helloRequest);
			log.debug(helloResponseBody.toString());
			helloResponseBody.setResponseStatus(ApplicationConstants.SUCCESS);
		} catch (Exception e) {
			e.printStackTrace();
			errorDescription = new ErrorDescription();
			errorDescription.setErrorCode(ApplicationConstants.ERROR_CODE_01);
			errorDescription.setErrorMessage(e.getMessage());
			helloResponseBody.setResponseStatus(ApplicationConstants.FAILURE);
		}

		return new ResponseEntity<HelloResponse>(helloResponseBody, httpStatus);
	}
}
