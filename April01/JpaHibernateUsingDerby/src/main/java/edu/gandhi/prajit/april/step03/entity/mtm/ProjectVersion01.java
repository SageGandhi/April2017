package edu.gandhi.prajit.april.step03.entity.mtm;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ProjectVersion01 {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToMany(mappedBy = "projectVersion01s")
	private Collection<EmployeeVersion01> employeeVersion01s;

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
	 * @return the employeeVersion01s
	 */
	public final Collection<EmployeeVersion01> getEmployeeVersion01s() {
		return employeeVersion01s;
	}

	/**
	 * @param employeeVersion01s
	 *            the employeeVersion01s to set
	 */
	public final void setEmployeeVersion01s(Collection<EmployeeVersion01> employeeVersion01s) {
		this.employeeVersion01s = employeeVersion01s;
	}
}
