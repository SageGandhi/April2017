package edu.gandhi.prajit.april.chapter01.adventity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import edu.gandhi.prajit.april.chapter00.adventity.id.CurrencyCompoundId;

@Entity
@IdClass(CurrencyCompoundId.class)
public class Currency {

	@Id
	@Column(name = "NAME")
	private String name;

	@Id
	@Column(name = "COUNTRY_NAME")
	private String countryName;

	@Override
	public String toString() {
		return "Currency [" + (name != null ? "name=" + name + ", " : "")
				+ (countryName != null ? "countryName=" + countryName + ", " : "")
				+ (symbol != null ? "symbol=" + symbol : "") + "]";
	}

	@Column(name = "SYMBOL")
	private String symbol;

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
	 * @return the countryName
	 */
	public final String getCountryName() {
		return countryName;
	}

	/**
	 * @param countryName
	 *            the countryName to set
	 */
	public final void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * @return the symbol
	 */
	public final String getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol
	 *            the symbol to set
	 */
	public final void setSymbol(String symbol) {
		this.symbol = symbol;
	}
}