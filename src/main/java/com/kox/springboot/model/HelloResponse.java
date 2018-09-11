/**
 * 
 */
package com.kox.springboot.model;

/**
 * @author KOXKAKKU
 *
 */
public class HelloResponse {
	/**
	 * member variable message
	 */
	private String message;
	/**
	 * member variable responseStatus
	 */
	private String responseStatus;
	/**
	 * member variable errorDescription
	 */
	private ErrorDescription errorDescription;
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the responseStatus
	 */
	public String getResponseStatus() {
		return responseStatus;
	}
	/**
	 * @param responseStatus the responseStatus to set
	 */
	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}
	/**
	 * @return the errorDescription
	 */
	public ErrorDescription getErrorDescription() {
		return errorDescription;
	}
	/**
	 * @param errorDescription the errorDescription to set
	 */
	public void setErrorDescription(ErrorDescription errorDescription) {
		this.errorDescription = errorDescription;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HelloResponse [");
		if (message != null) {
			builder.append("message=");
			builder.append(message);
			builder.append(", ");
		}
		if (responseStatus != null) {
			builder.append("responseStatus=");
			builder.append(responseStatus);
			builder.append(", ");
		}
		if (errorDescription != null) {
			builder.append("errorDescription=");
			builder.append(errorDescription);
		}
		builder.append("]");
		return builder.toString();
	}
	
	
}
