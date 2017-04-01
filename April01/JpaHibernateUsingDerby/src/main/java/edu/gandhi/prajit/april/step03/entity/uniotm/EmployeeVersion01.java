package edu.gandhi.prajit.april.step03.entity.uniotm;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class EmployeeVersion01 {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToMany
	@JoinTable(name = "EmpProject", joinColumns = @JoinColumn(name = "EmpId"), inverseJoinColumns = @JoinColumn(name = "ProjectId"))
	private Collection<ProjectVersion01> projectVersion01s;
	@OneToMany
	@JoinTable(name = "EmpPhone", joinColumns = @JoinColumn(name = "EmpId"), inverseJoinColumns = @JoinColumn(name = "PhoneId"))
	private Collection<PhoneVersion01> phoneVersion01s;

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

	/**
	 * @return the phoneVersion01s
	 */
	public final Collection<PhoneVersion01> getPhoneVersion01s() {
		return phoneVersion01s;
	}

	/**
	 * @param phoneVersion01s
	 *            the phoneVersion01s to set
	 */
	public final void setPhoneVersion01s(Collection<PhoneVersion01> phoneVersion01s) {
		this.phoneVersion01s = phoneVersion01s;
	}
}