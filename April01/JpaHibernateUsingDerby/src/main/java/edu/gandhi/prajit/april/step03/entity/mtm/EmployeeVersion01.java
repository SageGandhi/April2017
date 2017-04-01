package edu.gandhi.prajit.april.step03.entity.mtm;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class EmployeeVersion01 {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToMany
	private Collection<ProjectVersion01> projectVersion01s;

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
	 * @return the projectVersion01s
	 */
	public final Collection<ProjectVersion01> getProjectVersion01s() {
		return projectVersion01s;
	}

	/**
	 * @param projectVersion01s
	 *            the projectVersion01s to set
	 */
	public final void setProjectVersion01s(Collection<ProjectVersion01> projectVersion01s) {
		this.projectVersion01s = projectVersion01s;
	}
}
