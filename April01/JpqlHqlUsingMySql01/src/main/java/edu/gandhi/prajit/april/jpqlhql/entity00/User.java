package edu.gandhi.prajit.april.jpqlhql.entity00;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

@Entity
@Table(name = "FINANCES_USER")
public class User {
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Long userId;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "users")
	private Set<Account> accounts = new HashSet<Account>();
	@OneToOne(mappedBy = "user")
	private Credential credential;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "BIRTH_DATE")
	private Date birthDate;
	@Column(name = "EMAIL_ADDRESS")
	private String emailAddress;
	@ElementCollection
	@CollectionTable(name = "USER_ADDRESS", joinColumns = @JoinColumn(name = "USER_ID"))
	@AttributeOverrides({
			@AttributeOverride(name = "addressLine1", column = @Column(name = "USER_ADDRESS_LINE_1")),
			@AttributeOverride(name = "addressLine2", column = @Column(name = "USER_ADDRESS_LINE_2")) })
	private List<Address> addresses = new ArrayList<Address>();
	@Column(name = "LAST_UPDATED_DATE")
	private Date lastUpdatedDate;
	@Column(name = "LAST_UPDATED_BY")
	private String lastUpdatedBy;
	@Column(name = "CREATED_DATE", updatable = false)
	private Date createdDate;
	@Column(name = "CREATED_BY", updatable = false)
	private String createdBy;
	@Formula("lower(datediff(curdate(), birth_date)/365)")
	private int age;
	/**
	 * @return the userId
	 */
	public final Long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public final void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @return the accounts
	 */
	public final Set<Account> getAccounts() {
		return accounts;
	}
	/**
	 * @param accounts the accounts to set
	 */
	public final void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}
	/**
	 * @return the credential
	 */
	public final Credential getCredential() {
		return credential;
	}
	/**
	 * @param credential the credential to set
	 */
	public final void setCredential(Credential credential) {
		this.credential = credential;
	}
	/**
	 * @return the firstName
	 */
	public final String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public final String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the birthDate
	 */
	public final Date getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public final void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the emailAddress
	 */
	public final String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public final void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	/**
	 * @return the addresses
	 */
	public final List<Address> getAddresses() {
		return addresses;
	}
	/**
	 * @param addresses the addresses to set
	 */
	public final void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
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
	/**
	 * @return the age
	 */
	public final int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public final void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [" + (userId != null ? "userId=" + userId + ", " : "")
				+ (accounts != null ? "accounts=" + accounts + ", " : "")
				+ (credential != null ? "credential=" + credential + ", " : "")
				+ (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (lastName != null ? "lastName=" + lastName + ", " : "")
				+ (birthDate != null ? "birthDate=" + birthDate + ", " : "")
				+ (emailAddress != null ? "emailAddress=" + emailAddress + ", " : "")
				+ (addresses != null ? "addresses=" + addresses + ", " : "")
				+ (lastUpdatedDate != null ? "lastUpdatedDate=" + lastUpdatedDate + ", " : "")
				+ (lastUpdatedBy != null ? "lastUpdatedBy=" + lastUpdatedBy + ", " : "")
				+ (createdDate != null ? "createdDate=" + createdDate + ", " : "")
				+ (createdBy != null ? "createdBy=" + createdBy + ", " : "") + "age=" + age + "]";
	}
}