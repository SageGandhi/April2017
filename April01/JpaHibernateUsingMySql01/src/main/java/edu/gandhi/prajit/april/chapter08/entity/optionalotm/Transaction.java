package edu.gandhi.prajit.april.chapter08.entity.optionalotm;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSACTION")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRANSACTION_ID")
	private Long transactionId;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ACCOUNT_ID")
	private Account account;
	
	@Column(name = "TRANSACTION_TYPE")
	private String transactionType;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "AMOUNT")
	private BigDecimal amount;

	@Column(name = "INITIAL_BALANCE")
	private BigDecimal initialBalance;

	@Column(name = "CLOSING_BALANCE")
	private BigDecimal closingBalance;

	@Column(name = "NOTES")
	private String notes;

	@Column(name = "LAST_UPDATED_DATE")
	private Date lastUpdatedDate;

	@Column(name = "LAST_UPDATED_BY")
	private String lastUpdatedBy;

	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Override
	public String toString() {
		return "Transaction [" + (transactionId != null ? "transactionId=" + transactionId + ", " : "")
				+ (account != null ? "account=" + account + ", " : "")
				+ (transactionType != null ? "transactionType=" + transactionType + ", " : "")
				+ (title != null ? "title=" + title + ", " : "") + (amount != null ? "amount=" + amount + ", " : "")
				+ (initialBalance != null ? "initialBalance=" + initialBalance + ", " : "")
				+ (closingBalance != null ? "closingBalance=" + closingBalance + ", " : "")
				+ (notes != null ? "notes=" + notes + ", " : "")
				+ (lastUpdatedDate != null ? "lastUpdatedDate=" + lastUpdatedDate + ", " : "")
				+ (lastUpdatedBy != null ? "lastUpdatedBy=" + lastUpdatedBy + ", " : "")
				+ (createdDate != null ? "createdDate=" + createdDate + ", " : "")
				+ (createdBy != null ? "createdBy=" + createdBy : "") + "]";
	}

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
	 * @return the title
	 */
	public final String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public final void setTitle(String title) {
		this.title = title;
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
