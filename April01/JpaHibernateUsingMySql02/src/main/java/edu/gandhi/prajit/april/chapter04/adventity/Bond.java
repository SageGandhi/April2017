package edu.gandhi.prajit.april.chapter04.adventity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "BOND")
public class Bond extends Investment {

	@Column(name = "VALUE")
	private BigDecimal value;

	@Column(name = "INTEREST_RATE")
	private BigDecimal interestRate;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "MATURITY_DATE")
	private Date maturityDate;

	@Override
	public String toString() {
		return "Bond [" + (value != null ? "value=" + value + ", " : "")
				+ (interestRate != null ? "interestRate=" + interestRate + ", " : "")
				+ (maturityDate != null ? "maturityDate=" + maturityDate + ", " : "")
				+ (name != null ? "name=" + name + ", " : "") + (issuer != null ? "issuer=" + issuer + ", " : "")
				+ (purchaseDate != null ? "purchaseDate=" + purchaseDate : "") + "]";
	}

	/**
	 * @return the value
	 */
	public final BigDecimal getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public final void setValue(BigDecimal value) {
		this.value = value;
	}

	/**
	 * @return the interestRate
	 */
	public final BigDecimal getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public final void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * @return the maturityDate
	 */
	public final Date getMaturityDate() {
		return maturityDate;
	}

	/**
	 * @param maturityDate the maturityDate to set
	 */
	public final void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}
}