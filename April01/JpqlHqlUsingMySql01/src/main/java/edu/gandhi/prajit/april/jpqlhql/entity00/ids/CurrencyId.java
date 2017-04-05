package edu.gandhi.prajit.april.jpqlhql.entity00.ids;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CurrencyId implements Serializable {
	private String name;
	private String countryName;

	public CurrencyId() {

	}
	/**
	 * 
	 * @param name
	 * @param countryName
	 */
	public CurrencyId(String name, String countryName) {
		this.name = name;
		this.countryName = countryName;
	}
	/**
	 * 
	 * @return
	 */
	public final String getName() {
		return name;
	}
	/**
	 * 
	 * @return
	 */
	public final String getCountryName() {
		return countryName;
	}
	@Override
	public String toString() {
		return "CurrencyId [" + (name != null ? "name=" + name + ", " : "")
				+ (countryName != null ? "countryName=" + countryName : "") + "]";
	}
}