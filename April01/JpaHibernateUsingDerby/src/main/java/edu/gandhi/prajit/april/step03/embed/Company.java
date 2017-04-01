package edu.gandhi.prajit.april.step03.embed;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Company {
	@Id
	@GeneratedValue
	private Long officeId;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street",column=@Column(name="CompStreet")),
		@AttributeOverride(name="city",column=@Column(name="CompCity")),
		@AttributeOverride(name="zipCode",column=@Column(name="CompZip")),
		@AttributeOverride(name="state",column=@Column(name="CompState")),
		@AttributeOverride(name="country",column=@Column(name="CompCountry"))
	})
	private Address address;
	/**
	 * @return the officeId
	 */
	public final Long getOfficeId() {
		return officeId;
	}
	/**
	 * @param officeId the officeId to set
	 */
	public final void setOfficeId(Long officeId) {
		this.officeId = officeId;
	}
	/**
	 * @return the address
	 */
	public final Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public final void setAddress(Address address) {
		this.address = address;
	}

}
