package edu.gandhi.prajit.april.chapter05.adventity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PORTFOLIO")
public class Portfolio {

	@Id
	@GeneratedValue
	@Column(name = "PORTFOLIO_ID")
	private Long portfolioId;

	@Column(name = "NAME")
	private String name;

	@OneToMany(mappedBy = "portfolio")
	private List<Investment> investements = new ArrayList<Investment>();

	@Override
	public String toString() {
		return "Portfolio [" + (portfolioId != null ? "portfolioId=" + portfolioId + ", " : "")
				+ (name != null ? "name=" + name + ", " : "")
				+ (investements != null ? "investements=" + investements : "") + "]";
	}

	/**
	 * @return the portfolioId
	 */
	public final Long getPortfolioId() {
		return portfolioId;
	}

	/**
	 * @param portfolioId
	 *            the portfolioId to set
	 */
	public final void setPortfolioId(Long portfolioId) {
		this.portfolioId = portfolioId;
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
	 * @return the investements
	 */
	public final List<Investment> getInvestements() {
		return investements;
	}

	/**
	 * @param investements
	 *            the investements to set
	 */
	public final void setInvestements(List<Investment> investements) {
		this.investements = investements;
	}
}
