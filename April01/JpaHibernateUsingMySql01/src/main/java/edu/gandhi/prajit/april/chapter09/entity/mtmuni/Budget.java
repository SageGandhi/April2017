package edu.gandhi.prajit.april.chapter09.entity.mtmuni;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BUDGET")
public class Budget {

	@Id
	@GeneratedValue
	@Column(name = "BUDGET_ID")
	private Long budgetId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "GOAL_AMOUNT")
	private BigDecimal goalAmount;

	@Column(name = "PERIOD")
	private String period;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "BUDGET_TRANSACTION", joinColumns = @JoinColumn(name = "BUDGET_ID"), inverseJoinColumns = @JoinColumn(name = "TRANSACTION_ID"))
	private List<Transaction> transactions = new ArrayList<>();

	@Override
	public String toString() {
		return "Budget [" + (budgetId != null ? "budgetId=" + budgetId + ", " : "")
				+ (name != null ? "name=" + name + ", " : "")
				+ (goalAmount != null ? "goalAmount=" + goalAmount + ", " : "")
				+ (period != null ? "period=" + period + ", " : "")
				+ (transactions != null ? "transactions=" + transactions : "") + "]";
	}

	/**
	 * @return the budgetId
	 */
	public final Long getBudgetId() {
		return budgetId;
	}

	/**
	 * @param budgetId the budgetId to set
	 */
	public final void setBudgetId(Long budgetId) {
		this.budgetId = budgetId;
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
	 * @return the goalAmount
	 */
	public final BigDecimal getGoalAmount() {
		return goalAmount;
	}

	/**
	 * @param goalAmount the goalAmount to set
	 */
	public final void setGoalAmount(BigDecimal goalAmount) {
		this.goalAmount = goalAmount;
	}

	/**
	 * @return the period
	 */
	public final String getPeriod() {
		return period;
	}

	/**
	 * @param period the period to set
	 */
	public final void setPeriod(String period) {
		this.period = period;
	}

	/**
	 * @return the transactions
	 */
	public final List<Transaction> getTransactions() {
		return transactions;
	}

	/**
	 * @param transactions the transactions to set
	 */
	public final void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}	
}