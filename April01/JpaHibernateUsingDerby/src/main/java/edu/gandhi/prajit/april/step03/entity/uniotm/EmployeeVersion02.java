package edu.gandhi.prajit.april.step03.entity.uniotm;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class EmployeeVersion02 {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToMany
	private Collection<ProjectVersion02> projectVersion02s;
	@OneToMany
	private Collection<PhoneVersion02> phoneVersion02s;

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
	 * @return the projectVersion02s
	 */
	public final Collection<ProjectVersion02> getProjectVersion02s() {
		return projectVersion02s;
	}

	/**
	 * @param projectVersion02s the projectVersion02s to set
	 */
	public final void setProjectVersion02s(Collection<ProjectVersion02> projectVersion02s) {
		this.projectVersion02s = projectVersion02s;
	}

	/**
	 * @return the phoneVersion02s
	 */
	public final Collection<PhoneVersion02> getPhoneVersion02s() {
		return phoneVersion02s;
	}

	/**
	 * @param phoneVersion02s the phoneVersion02s to set
	 */
	public final void setPhoneVersion02s(Collection<PhoneVersion02> phoneVersion02s) {
		this.phoneVersion02s = phoneVersion02s;
	}	
}