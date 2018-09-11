package com.kox.springboot.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(ignoreResourceNotFound = true , value ="classpath:hello.properties")
public class PropertyManager {
	@Value("${GREETING_MESSAGE}")
	private String propertyGreetingMessage;

	/**
	 * @return the propertyGreetingMessage
	 */
	public String getPropertyGreetingMessage() {
		return propertyGreetingMessage;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PropertyManager [");
		if (propertyGreetingMessage != null) {
			builder.append("propertyGreetingMessage=");
			builder.append(propertyGreetingMessage);
		}
		builder.append("]");
		return builder.toString();
	}
	
	
}
