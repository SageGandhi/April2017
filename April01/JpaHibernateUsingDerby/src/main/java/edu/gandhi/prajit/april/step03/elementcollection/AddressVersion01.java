package edu.gandhi.prajit.april.step03.elementcollection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Access(AccessType.FIELD)
public class AddressVersion01 {
	@Column(name="StreetAddress")
	private String street;
	@Column(name="City")
	private String city;
	@Column(name="PostalCode")
	private String zipCode;
	@Column(name="State")
	private String state;
	@Column(name="Country")
	private String country;
	/**
	 * @return the street
	 */
	public final String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public final void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the city
	 */
	public final String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public final void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the zipCode
	 */
	public final String getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public final void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * @return the state
	 */
	public final String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public final void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the country
	 */
	public final String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public final void setCountry(String country) {
		this.country = country;
	}
}
