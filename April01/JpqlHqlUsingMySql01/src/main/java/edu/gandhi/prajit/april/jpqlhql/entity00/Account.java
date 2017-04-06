package edu.gandhi.prajit.april.jpqlhql.entity00;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import edu.gandhi.prajit.april.dao.util.QueryConstant;

@Entity
@Table(name = "ACCOUNT")
/** We Can Use Any One Of Them,Either Jpa Or Hibernate Annotation */
@javax.persistence.NamedQueries({
		@javax.persistence.NamedQuery(name = QueryConstant.AccountJpaDepositAbove500, query = "Select distinct transaction.account From Transaction transaction Where transaction.amount > 500 and lower(transaction.transactionType)='deposit'"),
		@javax.persistence.NamedQuery(name = QueryConstant.AccountJpaNameBankState, query = "Select distinct transaction.account.name,concat(concat(transaction.account.bank.name,'~'),transaction.account.bank.address.state) "
				+ "From Transaction transaction Where transaction.amount > :amount and transaction.transactionType=?1")
})
@org.hibernate.annotations.NamedQueries({
		@org.hibernate.annotations.NamedQuery(name = QueryConstant.AccountHibernateDepositAbove500, query = "Select distinct transaction.account From Transaction transaction Where transaction.amount > 500 and lower(transaction.transactionType)='deposit'") 
})
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ACCOUNT_ID")
	private Long accountId;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "USER_ACCOUNT", joinColumns = @JoinColumn(name = "ACCOUNT_ID"), inverseJoinColumns = @JoinColumn(name = "USER_ID"))
	private Set<User> users = new HashSet<>();
	@ManyToOne
	/*@ManyToOne(fetch=FetchType.LAZY)*/
	@JoinColumn(name = "BANK_ID")
	private Bank bank;
	@Enumerated(EnumType.STRING)
	@Column(name = "ACCOUNT_TYPE")
	private AccountType accountType;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "account")
	private List<Transaction> transactions = new ArrayList<>();
	@Column(name = "NAME")
	private String name;
	@Column(name = "INITIAL_BALANCE")
	private BigDecimal initialBalance;
	@Column(name = "CURRENT_BALANCE")
	private BigDecimal currentBalance;
	@Column(name = "OPEN_DATE")
	private Date openDate;
	@Column(name = "CLOSE_DATE")
	private Date closeDate;
	@Column(name = "LAST_UPDATED_DATE")
	private Date lastUpdatedDate;
	@Column(name = "LAST_UPDATED_BY")
	private String lastUpdatedBy;
	@Column(name = "CREATED_DATE")
	private Date createdDate;
	@Column(name = "CREATED_BY")
	private String createdBy;

	/**
	 * @return the accountId
	 */
	public final Long getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId
	 *            the accountId to set
	 */
	public final void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the users
	 */
	public final Set<User> getUsers() {
		return users;
	}

	/**
	 * @param users
	 *            the users to set
	 */
	public final void setUsers(Set<User> users) {
		this.users = users;
	}

	/**
	 * @return the bank
	 */
	public final Bank getBank() {
		return bank;
	}

	/**
	 * @param bank
	 *            the bank to set
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
	 * @param accountType
	 *            the accountType to set
	 */
	public final void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the transactions
	 */
	public final List<Transaction> getTransactions() {
		return transactions;
	}

	/**
	 * @param transactions
	 *            the transactions to set
	 */
	public final void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
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
	 * @return the initialBalance
	 */
	public final BigDecimal getInitialBalance() {
		return initialBalance;
	}

	/**
	 * @param initialBalance
	 *            the initialBalance to set
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
	 * @param currentBalance
	 *            the currentBalance to set
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
	 * @param openDate
	 *            the openDate to set
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
	 * @param closeDate
	 *            the closeDate to set
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
	 * @param lastUpdatedDate
	 *            the lastUpdatedDate to set
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
	 * @param lastUpdatedBy
	 *            the lastUpdatedBy to set
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
	 * @param createdDate
	 *            the createdDate to set
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
	 * @param createdBy
	 *            the createdBy to set
	 */
	public final void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "Account [" + (accountId != null ? "accountId=" + accountId + ", " : "")
				+ (accountType != null ? "accountType=" + accountType + ", " : "")
				+ (name != null ? "name=" + name + ", " : "")
				+ (initialBalance != null ? "initialBalance=" + initialBalance + ", " : "")
				+ (currentBalance != null ? "currentBalance=" + currentBalance + ", " : "")
				+ (openDate != null ? "openDate=" + openDate + ", " : "")
				+ (closeDate != null ? "closeDate=" + closeDate + ", " : "")
				+ (lastUpdatedDate != null ? "lastUpdatedDate=" + lastUpdatedDate + ", " : "")
				+ (lastUpdatedBy != null ? "lastUpdatedBy=" + lastUpdatedBy + ", " : "")
				+ (createdDate != null ? "createdDate=" + createdDate + ", " : "")
				+ (createdBy != null ? "createdBy=" + createdBy : "") + "]";
	}
}