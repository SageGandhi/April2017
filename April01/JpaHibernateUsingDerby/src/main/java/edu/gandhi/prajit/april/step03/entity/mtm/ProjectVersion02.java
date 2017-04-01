package edu.gandhi.prajit.april.step03.entity.mtm;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ProjectVersion02 {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToMany(mappedBy = "projectVersion02s")
	private Collection<EmployeeVersion02> employeeVersion02s;

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
	 * @return the employeeVersion02s
	 */
	public final Collection<EmployeeVersion02> getEmployeeVersion02s() {
		return employeeVersion02s;
	}

	/**
	 * @param employeeVersion02s the employeeVersion02s to set
	 */
	public final void setEmployeeVersion02s(Collection<EmployeeVersion02> employeeVersion02s) {
		this.employeeVersion02s = employeeVersion02s;
	}
}
