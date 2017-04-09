package edu.gandhi.prajit.jaxb.example01.classes;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "name", "capital", "continent",
		"population" }, namespace = "edu.gandhi.prajit.jaxb.example01.classes")
@XmlRootElement(name = "JcgCountry", namespace = "edu.gandhi.prajit.jaxb.example01.classes")
public class JcgCountry {
	private String name;
	private String capital;
	private String continent;
	private String population;
	private String nationalLanguage;

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
	@XmlElement(name = "Name")
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the capital
	 */
	public final String getCapital() {
		return capital;
	}

	/**
	 * @param capital
	 *            the capital to set
	 */
	@XmlElement(name = "Capital")
	public final void setCapital(String capital) {
		this.capital = capital;
	}

	/**
	 * @return the continent
	 */
	public final String getContinent() {
		return continent;
	}

	/**
	 * @param continent
	 *            the continent to set
	 */
	@XmlElement(name = "Continent")
	public final void setContinent(String continent) {
		this.continent = continent;
	}

	/**
	 * @return the population
	 */
	public final String getPopulation() {
		return population;
	}

	/**
	 * @param population
	 *            the population to set
	 */
	@XmlElement(name = "Population")
	public final void setPopulation(String population) {
		this.population = population;
	}

	/**
	 * @return the nationalLanguage
	 */
	public final String getNationalLanguage() {
		return nationalLanguage;
	}

	/**
	 * @param nationalLanguage
	 *            the nationalLanguage to set
	 */
	@XmlAttribute(name = "NationalLanguage")
	public final void setNationalLanguage(String nationalLanguage) {
		this.nationalLanguage = nationalLanguage;
	}
}