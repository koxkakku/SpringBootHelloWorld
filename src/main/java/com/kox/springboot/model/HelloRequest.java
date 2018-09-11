/**
 * 
 */
package com.kox.springboot.model;

/**
 * @author KOXKAKKU
 *
 */
public class HelloRequest {
	/**
	 * member variable guestName
	 */
	private String guestName;

	/**
	 * member variable guestGender
	 */
	private String guestGender;
	
	/**
	 * @return the guestName
	 */
	public String getGuestName() {
		return guestName;
	}

	/**
	 * @param guestName the guestName to set
	 */
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	
	/**
	 * @return the guestGender
	 */
	public String getGuestGender() {
		return guestGender;
	}

	/**
	 * @param guestGender the guestGender to set
	 */
	public void setGuestGender(String guestGender) {
		this.guestGender = guestGender;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HelloRequest [");
		if (guestName != null) {
			builder.append("guestName=");
			builder.append(guestName);
			builder.append(", ");
		}
		if (guestGender != null) {
			builder.append("guestGender=");
			builder.append(guestGender);
		}
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
