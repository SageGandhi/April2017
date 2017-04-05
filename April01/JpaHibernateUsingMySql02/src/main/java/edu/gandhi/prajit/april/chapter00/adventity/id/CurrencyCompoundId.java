package edu.gandhi.prajit.april.chapter00.adventity.id;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CurrencyCompoundId implements Serializable {
	private String name;
	private String countryName;

	public CurrencyCompoundId() {
	}

	@Override
	public String toString() {
		return "CurrencyCompoundId [" + (name != null ? "name=" + name + ", " : "")
				+ (countryName != null ? "countryName=" + countryName : "") + "]";
	}

	/**
	 * @param name
	 * @param countryName
	 */
	public CurrencyCompoundId(String name, String countryName) {
		this.name = name;
		this.countryName = countryName;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @return the countryName
	 */
	public final String getCountryName() {
		return countryName;
	}
}