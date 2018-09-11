/**
 * 
 */
package com.kox.springboot.service;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kox.springboot.constants.ApplicationConstants;
import com.kox.springboot.model.HelloRequest;
import com.kox.springboot.model.HelloResponse;
import com.kox.springboot.util.PropertyManager;

/**
 * @author KOXKAKKU
 *
 */
@Service
public class HelloServiceManagerImpl implements HelloServiceManager {

	@Autowired
	PropertyManager propertyManager;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.kox.springboot.service.HelloServiceManager#sayHello(com.kox.springboot.
	 * model.HelloRequest)
	 */
	@Override
	public HelloResponse sayHello(HelloRequest helloRequest) throws Exception {
		HelloResponse helloResponse = new HelloResponse();
		helloResponse.setMessage(MessageFormat.format(propertyManager.getPropertyGreetingMessage(),
				getSalutation(helloRequest.getGuestGender()),
				StringUtils.isNotBlank(helloRequest.getGuestName()) ? helloRequest.getGuestName()
						: ApplicationConstants.GUEST));
		return helloResponse;
	}

	private String getSalutation(String gender) {
		Map<String, String> salutation = new HashMap<String, String>();
		salutation.put(ApplicationConstants.GENDER_MALE, ApplicationConstants.GREETING_SALUTATION_MR);
		salutation.put(ApplicationConstants.GENDER_FEMALE, ApplicationConstants.GREETING_SALUTATION_MS);
		return StringUtils.isNotBlank(gender) && StringUtils.isNotBlank(salutation.get(gender)) ? salutation.get(gender)
				: salutation.get(ApplicationConstants.GENDER_MALE);
	}
}
