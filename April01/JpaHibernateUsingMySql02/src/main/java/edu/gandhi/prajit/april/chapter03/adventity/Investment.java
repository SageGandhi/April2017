package edu.gandhi.prajit.april.chapter03.adventity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Investment {

	@Column(name = "NAME")
	protected String name;

	@Column(name = "ISSUER")
	protected String issuer;

	@Column(name = "PURCHASE_DATE")
	protected Date purchaseDate;

	@Override
	public String toString() {
		return "Investment [" + (name != null ? "name=" + name + ", " : "")
				+ (issuer != null ? "issuer=" + issuer + ", " : "")
				+ (purchaseDate != null ? "purchaseDate=" + purchaseDate : "") + "]";
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
	 * @return the issuer
	 */
	public final String getIssuer() {
		return issuer;
	}

	/**
	 * @param issuer
	 *            the issuer to set
	 */
	public final void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	/**
	 * @return the purchaseDate
	 */
	public final Date getPurchaseDate() {
		return purchaseDate;
	}

	/**
	 * @param purchaseDate
	 *            the purchaseDate to set
	 */
	public final void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
}