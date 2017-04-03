package edu.gandhi.prajit.april.chapter01.entity.Ver00;

import java.math.BigDecimal;
import java.util.Date;

public class Account {

	private Long accountId;

	private Bank bank;

	private AccountType accountType;

	private String name;

	private BigDecimal initialBalance;

	private BigDecimal currentBalance;

	private Date openDate;

	private Date closeDate;

	private Date lastUpdatedDate;

	private String lastUpdatedBy;

	private Date createdDate;

	private String createdBy;

	/**
	 * @return the accountId
	 */
	public final Long getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId the accountId to set
	 */
	public final void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the bank
	 */
	public final Bank getBank() {
		return bank;
	}

	/**
	 * @param bank the bank to set
	 */
	public final void setBank(Bank bank) {
		this.bank = bank;
	}

	/**
	 * @return the accountType
	 */
	public final AccountType getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public final void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
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
	 * @return the currentBalance
	 */
	public final BigDecimal getCurrentBalance() {
		return currentBalance;
	}

	/**
	 * @param currentBalance the currentBalance to set
	 */
	public final void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}

	/**
	 * @return the openDate
	 */
	public final Date getOpenDate() {
		return openDate;
	}

	/**
	 * @param openDate the openDate to set
	 */
	public final void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	/**
	 * @return the closeDate
	 */
	public final Date getCloseDate() {
		return closeDate;
	}

	/**
	 * @param closeDate the closeDate to set
	 */
	public final void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
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