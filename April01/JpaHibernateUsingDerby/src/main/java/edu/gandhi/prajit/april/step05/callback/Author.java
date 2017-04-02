package edu.gandhi.prajit.april.step05.callback;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ExcludeDefaultListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity // Default Name Is Author
@Table(name = "AuthorDetails", schema = "APP")
@NamedQueries({
		@NamedQuery(name = "Author.SortByAuthorName.Positional", query = "select author from Author author where author.dateOfBirth >?1 order by author.firstName asc,author.lastName desc"),
		@NamedQuery(name = "Author.SortByAuthorName.Named", query = "select author from Author author where author.dateOfBirth >:Age order by author.firstName asc,author.lastName desc")})
@EntityListeners({ AgeCalculationListener.class, ValidationListener.class })
@ExcludeDefaultListeners
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

	/**
	 * Business Logic That Required For Specific Entity.To Make It General For
	 * All Entity We Make It A Cross-Cutting Concern Using @EntityListener
	 */
	@PrePersist
	@PreUpdate
	private void ValidateName() {
		if (firstName == null || "".equals(firstName))
			throw new IllegalArgumentException("Invalid First Name");
		if (lastName == null || "".equals(lastName))
			throw new IllegalArgumentException("Invalid Last Name");
	}

	@PostLoad
	@PostPersist
	@PostUpdate
	private void SetAgeFromBirthDay() {
		if (dateOfBirth == null) {
			age = null;
			return;
		}
		Calendar birth = new GregorianCalendar();
		birth.setTime(dateOfBirth);
		Calendar now = new GregorianCalendar();
		now.setTime(new Date());
		age = now.get(Calendar.YEAR) - birth.get(Calendar.YEAR)
				+ ((now.get(Calendar.DAY_OF_YEAR) - birth.get(Calendar.DAY_OF_YEAR) < 0) ? -1 : 0);
	}

	@PreRemove
	private void preRemoveMethod() {
		System.out.println("Thinking... What To Do?");
	}

	@PostRemove
	private void postRemoveMethod() {
		System.out.println("My New Home..Jvm HeapSpce.");
	}
}
