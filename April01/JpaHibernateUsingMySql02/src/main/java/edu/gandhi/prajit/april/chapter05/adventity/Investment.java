package edu.gandhi.prajit.april.chapter05.adventity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="NameOfTheColumnToDifferentiateBetweenSubClasses")
@Table(name="Investment")
public abstract class Investment {

	@Id
	@GeneratedValue
	@Column(name = "INVESTMENT_ID")
	private Long investmentId;

	@JoinColumn(name = "PORTFOLIO_ID")
	@ManyToOne(cascade = CascadeType.ALL)
	private Portfolio portfolio;

	@Column(name = "NAME")
	protected String name;

	@Column(name = "ISSUER")
	protected String issuer;

	@Column(name = "PURCHASE_DATE")
	protected Date purchaseDate;

	@Override
	public String toString() {
		return "Investment [" + (investmentId != null ? "investmentId=" + investmentId + ", " : "")
				+ (portfolio != null ? "portfolio=" + portfolio + ", " : "")
				+ (name != null ? "name=" + name + ", " : "") + (issuer != null ? "issuer=" + issuer + ", " : "")
				+ (purchaseDate != null ? "purchaseDate=" + purchaseDate : "") + "]";
	}

	/**
	 * @return the investmentId
	 */
	public final Long getInvestmentId() {
		return investmentId;
	}

	/**
	 * @param investmentId the investmentId to set
	 */
	public final void setInvestmentId(Long investmentId) {
		this.investmentId = investmentId;
	}

	/**
	 * @return the portfolio
	 */
	public final Portfolio getPortfolio() {
		return portfolio;
	}

	/**
	 * @param portfolio the portfolio to set
	 */
	public final void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name the name to set
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
	 * @param issuer the issuer to set
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
	 * @param purchaseDate the purchaseDate to set
	 */
	public final void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
}