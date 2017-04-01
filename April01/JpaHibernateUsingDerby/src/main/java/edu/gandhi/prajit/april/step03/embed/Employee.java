package edu.gandhi.prajit.april.step03.embed;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Employee {
	@Id
	@GeneratedValue
	private Long empId;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street",column=@Column(name="EmpStreet")),
		@AttributeOverride(name="city",column=@Column(name="EmpCity")),
		@AttributeOverride(name="zipCode",column=@Column(name="EmpZip")),
		@AttributeOverride(name="state",column=@Column(name="EmpState")),
		@AttributeOverride(name="country",column=@Column(name="EmpCountry"))
	})
	private Address address;

	/**
	 * @return the empId
	 */
	public final Long getEmpId() {
		return empId;
	}

	/**
	 * @param empId
	 *            the empId to set
	 */
	public final void setEmpId(Long empId) {
		this.empId = empId;
	}

	/**
	 * @return the address
	 */
	public final Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public final void setAddress(Address address) {
		this.address = address;
	}
}
