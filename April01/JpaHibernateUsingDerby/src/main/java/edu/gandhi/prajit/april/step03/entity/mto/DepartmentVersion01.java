package edu.gandhi.prajit.april.step03.entity.mto;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * CREATE TABLE DEPARTMENTVERSION01 (ID BIGINT NOT NULL, PRIMARY KEY (ID))
 */
@Entity
public class DepartmentVersion01 {
	@Id
	@GeneratedValue
	private Long id;
	
	private Collection<EmployeeVersion01> employeeVersion01s;

	/**
	 * @return the employeeVersion01s
	 */
	public final Collection<EmployeeVersion01> getEmployeeVersion01s() {
		return employeeVersion01s;
	}

	/**
	 * @param employeeVersion01s the employeeVersion01s to set
	 */
	public final void setEmployeeVersion01s(Collection<EmployeeVersion01> employeeVersion01s) {
		this.employeeVersion01s = employeeVersion01s;
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
}
