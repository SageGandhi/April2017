package edu.gandhi.prajit.april.chapter04.entityunioto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CREDENTIAL")
public class Credential {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CREDENTIAL_ID")
	public Long credentialId;

	@OneToOne(cascade = CascadeType.ALL)
	/**
	 * When Performing Join On Clause Will Contain The Name Of Foreign Key In
	 * JoinColumn name,User Primary Key Can Be Mentioned In
	 * referencedColumnName. So name Corresponds To Source Entity &
	 * referencedColumnName Corresponds To Target Entity In On Clause.
	 */
	@JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
	public User user;

	@Column(name = "USERNAME")
	private String username;

	@Column(name = "PASSWORD")
	private String password;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((credentialId == null) ? 0 : credentialId.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		if (!(obj instanceof Credential)) {
			return false;
		}
		Credential other = (Credential) obj;
		if (credentialId == null) {
			if (other.credentialId != null) {
				return false;
			}
		} else if (!credentialId.equals(other.credentialId)) {
			return false;
		}
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
			return false;
		}
		if (user == null) {
			if (other.user != null) {
				return false;
			}
		} else if (!user.equals(other.user)) {
			return false;
		}
		if (username == null) {
			if (other.username != null) {
				return false;
			}
		} else if (!username.equals(other.username)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Credential [" + (credentialId != null ? "credentialId=" + credentialId + ", " : "")
				+ (user != null ? "user=" + user + ", " : "") + (username != null ? "username=" + username + ", " : "")
				+ (password != null ? "password=" + password : "") + "]";
	}

	/**
	 * @return the credentialId
	 */
	public final Long getCredentialId() {
		return credentialId;
	}

	/**
	 * @param credentialId
	 *            the credentialId to set
	 */
	public final void setCredentialId(Long credentialId) {
		this.credentialId = credentialId;
	}

	/**
	 * @return the user
	 */
	public final User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public final void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the username
	 */
	public final String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public final void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public final String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public final void setPassword(String password) {
		this.password = password;
	}
}
