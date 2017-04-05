package edu.gandhi.prajit.april.jpqlhql.entity00;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ST")
public class Stock extends Investment {
	@Column(name = "SHARE_PRICE")
	private BigDecimal sharePrice;
	@Column(name = "QUANTITY")
	private BigDecimal quantity;
	/**
	 * @return the sharePrice
	 */
	public final BigDecimal getSharePrice() {
		return sharePrice;
	}
	/**
	 * @param sharePrice the sharePrice to set
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
	 * @param quantity the quantity to set
	 */
	public final void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Stock [" + (sharePrice != null ? "sharePrice=" + sharePrice + ", " : "")
				+ (quantity != null ? "quantity=" + quantity + ", " : "") + (name != null ? "name=" + name + ", " : "")
				+ (issuer != null ? "issuer=" + issuer + ", " : "")
				+ (purchaseDate != null ? "purchaseDate=" + purchaseDate : "") + "]";
	}
	
}