package edu.gandhi.prajit.april.step04.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Musician02 {
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "first_name", length = 50)
	protected String firstName;

	@Column(name = "last_name", length = 50)
	protected String lastName;

	@Column(length = 5000)
	protected String bio;

	@Column(name = "date_of_birth")
	@Temporal(TemporalType.DATE)
	protected Date dateOfBirth;

	@Transient
	protected Integer age;

	@Column(name = "preferred_instrument")
	private String preferredInstrument;

	public Musician02() {
	}

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param bio
	 * @param dateOfBirth
	 * @param age
	 * @param preferredInstrument
	 */
	public Musician02(String firstName, String lastName, String bio, Date dateOfBirth, Integer age,
			String preferredInstrument) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.bio = bio;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.preferredInstrument = preferredInstrument;
	}

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 */
	public Musician02(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((bio == null) ? 0 : bio.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((preferredInstrument == null) ? 0 : preferredInstrument.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Musician02)) {
			return false;
		}
		Musician02 other = (Musician02) obj;
		if (age == null) {
			if (other.age != null) {
				return false;
			}
		} else if (!age.equals(other.age)) {
			return false;
		}
		if (bio == null) {
			if (other.bio != null) {
				return false;
			}
		} else if (!bio.equals(other.bio)) {
			return false;
		}
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null) {
				return false;
			}
		} else if (!dateOfBirth.equals(other.dateOfBirth)) {
			return false;
		}
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		if (preferredInstrument == null) {
			if (other.preferredInstrument != null) {
				return false;
			}
		} else if (!preferredInstrument.equals(other.preferredInstrument)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Musician [" + (id != null ? "id=" + id + ", " : "")
				+ (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (lastName != null ? "lastName=" + lastName + ", " : "") + (bio != null ? "bio=" + bio + ", " : "")
				+ (dateOfBirth != null ? "dateOfBirth=" + dateOfBirth + ", " : "")
				+ (age != null ? "age=" + age + ", " : "")
				+ (preferredInstrument != null ? "preferredInstrument=" + preferredInstrument : "") + "]";
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
	 * @return the preferredInstrument
	 */
	public final String getPreferredInstrument() {
		return preferredInstrument;
	}

	/**
	 * @param preferredInstrument
	 *            the preferredInstrument to set
	 */
	public final void setPreferredInstrument(String preferredInstrument) {
		this.preferredInstrument = preferredInstrument;
	}
}