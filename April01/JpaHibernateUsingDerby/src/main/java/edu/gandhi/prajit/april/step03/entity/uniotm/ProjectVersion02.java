package edu.gandhi.prajit.april.step03.entity.uniotm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProjectVersion02 {
	@Id
	@GeneratedValue
	private Long id;

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
}