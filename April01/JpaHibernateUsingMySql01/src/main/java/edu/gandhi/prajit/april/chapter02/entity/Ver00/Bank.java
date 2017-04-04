package edu.gandhi.prajit.april.chapter02.entity.Ver00;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "BANK")
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BANK_ID")
	private Long bankId;

	@Column(name = "NAME")
	private String name;

	@Embedded
	private Address address = new Address();

	@Column(name = "IS_INTERNATIONAL")
	private boolean international;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATED_DATE")
	private Date lastUpdatedDate;

	@Column(name = "LAST_UPDATED_BY")
	private String lastUpdatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "CREATED_BY")
	private String createdBy;

	/**
	 * 
	 * @return
	 */
	public String getAddressLine1() {
		return address.getAddressLine1();
	}

	/**
	 * 
	 * @param addressLine1
	 */
	public void setAddressLine1(String addressLine1) {
		this.address.setAddressLine1(addressLine1);
	}

	/**
	 * 
	 * @return
	 */
	public String getAddressLine2() {
		return address.getAddressLine2();
	}

	/**
	 * 
	 * @param addressLine2
	 */
	public void setAddressLine2(String addressLine2) {
		this.address.setAddressLine2(addressLine2);
	}

	/**
	 * 
	 * @return
	 */
	public String getCity() {
		return address.getCity();
	}

	/**
	 * 
	 * @param city
	 */
	public void setCity(String city) {
		this.address.setCity(city);
	}

	/**
	 * 
	 * @return
	 */
	public String getState() {
		return address.getState();
	}

	/**
	 * 
	 * @param state
	 */
	public void setState(String state) {
		this.address.setState(state);
	}

	/**
	 * 
	 * @return
	 */
	public String getZipCode() {
		return address.getZipCode();
	}

	/**
	 * 
	 * @param zipCode
	 */
	public void setZipCode(String zipCode) {
		this.address.setZipCode(zipCode);
	}

	/**
	 * @return the bankId
	 */
	public final Long getBankId() {
		return bankId;
	}

	/**
	 * @param bankId
	 *            the bankId to set
	 */
	public final void setBankId(Long bankId) {
		this.bankId = bankId;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the international
	 */
	public final boolean isInternational() {
		return international;
	}

	/**
	 * @param international
	 *            the international to set
	 */
	public final void setInternational(boolean international) {
		this.international = international;
	}

	/**
	 * @return the lastUpdatedDate
	 */
	public final Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	/**
	 * @param lastUpdatedDate
	 *            the lastUpdatedDate to set
	 */
	public final void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	/**
	 * @return the lastUpdatedBy
	 */
	public final String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	/**
	 * @param lastUpdatedBy
	 *            the lastUpdatedBy to set
	 */
	public final void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	/**
	 * @return the createdDate
	 */
	public final Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public final void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the createdBy
	 */
	public final String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public final void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
}