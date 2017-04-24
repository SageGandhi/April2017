package edu.gandhi.prajit.april.data.model;

public class User00 {
	private String emailId;
	private String firstName;
	private String lastName;

	@Override
	public String toString() {
		return "User00 [" + (emailId != null ? "emailId=" + emailId + ", " : "")
				+ (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (lastName != null ? "lastName=" + lastName : "") + "]";
	}

	/**
	 * @return the emailId
	 */
	public final String getEmailId() {
		return emailId;
	}

	/**
	 * @return the firstName
	 */
	public final String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public final String getLastName() {
		return lastName;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public final void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
