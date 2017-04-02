package edu.gandhi.prajit.april.step05.callback;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class ValidationListener {
	@PrePersist
	@PreUpdate
	private void ValidateName(Author author) {
		if (author.getFirstName() == null || "".equals(author.getFirstName()))
			throw new IllegalArgumentException("Invalid First Name");
		if (author.getFirstName() == null || "".equals(author.getLastName()))
			throw new IllegalArgumentException("Invalid Last Name");
	}

}