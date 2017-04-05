package edu.gandhi.prajit.april.chapter03.adventity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STOCK")
public class Stock extends Investment {

	@Id
	@GeneratedValue
	@Column(name = "STOCK_ID")
	private Long stockId;

	@Column(name = "SHARE_PRICE")
	private BigDecimal sharePrice;

	@Column(name = "QUANTITY")
	private BigDecimal quantity;

	@Override
	public String toString() {
		return "Stock [" + (stockId != null ? "stockId=" + stockId + ", " : "")
				+ (sharePrice != null ? "sharePrice=" + sharePrice + ", " : "")
				+ (quantity != null ? "quantity=" + quantity + ", " : "") + (name != null ? "name=" + name + ", " : "")
				+ (issuer != null ? "issuer=" + issuer + ", " : "")
				+ (purchaseDate != null ? "purchaseDate=" + purchaseDate : "") + "]";
	}

	/**
	 * @return the stockId
	 */
	public final Long getStockId() {
		return stockId;
	}

	/**
	 * @param stockId
	 *            the stockId to set
	 */
	public final void setStockId(Long stockId) {
		this.stockId = stockId;
	}

	/**
	 * @return the sharePrice
	 */
	public final BigDecimal getSharePrice() {
		return sharePrice;
	}

	/**
	 * @param sharePrice
	 *            the sharePrice to set
	 */
	public final void setSharePrice(BigDecimal sharePrice) {
		this.sharePrice = sharePrice;
	}

	/**
	 * @return the quantity
	 */
	public final BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public final void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
}
