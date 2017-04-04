package edu.gandhi.prajit.april.chapter10.entity.mtmbi;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	@Column(name = "ADDRESS_LINE_1")
	private String addressLine1;

	@Column(name = "ADDRESS_LINE_2")
	private String addressLine2;

	@Column(name = "CITY")
	private String city;

	@Column(name = "STATE")
	private String state;

	@Column(name = "ZIP_CODE")
	private String zipCode;

	@Column(name = "ADDRESS_TYPE")
	private String addressType;

	@Override
	public String toString() {
		return "Address [" + (addressLine1 != null ? "addressLine1=" + addressLine1 + ", " : "")
				+ (addressLine2 != null ? "addressLine2=" + addressLine2 + ", " : "")
				+ (city != null ? "city=" + city + ", " : "") + (state != null ? "state=" + state + ", " : "")
				+ (zipCode != null ? "zipCode=" + zipCode + ", " : "")
				+ (addressType != null ? "addressType=" + addressType : "") + "]";
	}

	/**
	 * @return the addressLine1
	 */
	public final String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @param addressLine1
	 *            the addressLine1 to set
	 */
	public final void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * @return the addressLine2
	 */
	public final String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @param addressLine2
	 *            the addressLine2 to set
	 */
	public final void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * @return the city
	 */
	public final String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public final void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public final String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public final void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipCode
	 */
	public final String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode
	 *            the zipCode to set
	 */
	public final void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the addressType
	 */
	public final String getAddressType() {
		return addressType;
	}

	/**
	 * @param addressType
	 *            the addressType to set
	 */
	public final void setAddressType(String addressType) {
		this.addressType = addressType;
	}
}