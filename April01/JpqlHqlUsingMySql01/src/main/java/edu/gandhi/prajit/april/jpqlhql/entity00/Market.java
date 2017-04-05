package edu.gandhi.prajit.april.jpqlhql.entity00;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MARKET")
public class Market {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MARKET_ID")
	private Long marketId;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumns({
		@JoinColumn(name="CURRENCY_NAME", referencedColumnName="NAME"),
		@JoinColumn(name="COUNTRY_NAME", referencedColumnName="COUNTRY_NAME")
	})
	private Currency currency;
	@Column(name = "MARKET_NAME")
	private String marketName;
	/**
	 * @return the marketId
	 */
	public final Long getMarketId() {
		return marketId;
	}
	/**
	 * @param marketId the marketId to set
	 */
	public final void setMarketId(Long marketId) {
		this.marketId = marketId;
	}
	/**
	 * @return the currency
	 */
	public final Currency getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public final void setCurrency(Currency currency) {
		this.currency = currency;
	}
	/**
	 * @return the marketName
	 */
	public final String getMarketName() {
		return marketName;
	}
	/**
	 * @param marketName the marketName to set
	 */
	public final void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	@Override
	public String toString() {
		return "Market [" + (marketId != null ? "marketId=" + marketId + ", " : "")
				+ (currency != null ? "currency=" + currency + ", " : "")
				+ (marketName != null ? "marketName=" + marketName : "") + "]";
	}
}