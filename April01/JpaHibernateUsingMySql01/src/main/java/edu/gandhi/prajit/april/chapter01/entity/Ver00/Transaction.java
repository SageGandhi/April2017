package edu.gandhi.prajit.april.chapter01.entity.Ver00;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {

	private Long transactionId;

	private Account account;

	private String transactionType;

	private BigDecimal amount;

	private BigDecimal initialBalance;

	private BigDecimal closingBalance;

	private String notes;

	private Date lastUpdatedDate;

	private String lastUpdatedBy;

	private Date createdDate;

	private String createdBy;

	/**
	 * @return the transactionId
	 */
	public final Long getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public final void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * @return the account
	 */
	public final Account getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public final void setAccount(Account account) {
		this.account = account;
	}

	/**
	 * @return the transactionType
	 */
	public final String getTransactionType() {
		return transactionType;
	}

	/**
	 * @param transactionType the transactionType to set
	 */
	public final void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	/**
	 * @return the amount
	 */
	public final BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public final void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * @return the initialBalance
	 */
	public final BigDecimal getInitialBalance() {
		return initialBalance;
	}

	/**
	 * @param initialBalance the initialBalance to set
	 */
	public final void setInitialBalance(BigDecimal initialBalance) {
		this.initialBalance = initialBalance;
	}

	/**
	 * @return the closingBalance
	 */
	public final BigDecimal getClosingBalance() {
		return closingBalance;
	}

	/**
	 * @param closingBalance the closingBalance to set
	 */
	public final void setClosingBalance(BigDecimal closingBalance) {
		this.closingBalance = closingBalance;
	}

	/**
	 * @return the notes
	 */
	public final String getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public final void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * @return the lastUpdatedDate
	 */
	public final Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	/**
	 * @param lastUpdatedDate the lastUpdatedDate to set
	 */
	public final void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	/**
	 * @return the lastUpdatedBy
	 */
	public final String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	/**
	 * @param lastUpdatedBy the lastUpdatedBy to set
	 */
	public final void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	/**
	 * @return the createdDate
	 */
	public final Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public final void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the createdBy
	 */
	public final String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public final void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}	
}