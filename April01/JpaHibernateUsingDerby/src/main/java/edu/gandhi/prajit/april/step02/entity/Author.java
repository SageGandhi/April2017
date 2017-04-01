package edu.gandhi.prajit.april.step02.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
// Default Name Is Author
@Table(name = "AuthorDetails", schema = "APP")
public class Author {
	public enum Language {
		English, French, Spanish, Portuguese, Russian, Chinese, Indian, German, Japanese
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "AuthorFirstName", length = 100, nullable = false)
	private String firstName;
	@Column(name = "AuthorLastName", length = 100, nullable = true)
	private String lastName;
	@Column(length = 1000)
	private String bio;
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	@Transient
	private Integer age;
	@Enumerated(EnumType.STRING) // Default Ordinal
	private Language language;

	public Author() {
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param bio
	 * @param dateOfBirth
	 * @param age
	 * @param language
	 */
	public Author(String firstName, String lastName, String bio, Date dateOfBirth, Language language) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.bio = bio;
		this.dateOfBirth = dateOfBirth;
		this.language = language;
	}

	@Override
	public String toString() {
		return "Author [" + (id != null ? "id=" + id + ", " : "")
				+ (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (lastName != null ? "lastName=" + lastName + ", " : "") + (bio != null ? "bio=" + bio + ", " : "")
				+ (dateOfBirth != null ? "dateOfBirth=" + dateOfBirth + ", " : "")
				+ (age != null ? "age=" + age + ", " : "") + (language != null ? "language=" + language : "") + "]";
	}

	/**
	 * @return the id
	 */
	public final Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public final void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public final String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
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
	 * @param lastName
	 *            the lastName to set
	 */
	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the bio
	 */
	public final String getBio() {
		return bio;
	}

	/**
	 * @param bio
	 *            the bio to set
	 */
	public final void setBio(String bio) {
		this.bio = bio;
	}

	/**
	 * @return the dateOfBirth
	 */
	public final Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public final void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the age
	 */
	public final Integer getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public final void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the language
	 */
	public final Language getLanguage() {
		return language;
	}

	/**
	 * @param language
	 *            the language to set
	 */
	public final void setLanguage(Language language) {
		this.language = language;
	}
}
