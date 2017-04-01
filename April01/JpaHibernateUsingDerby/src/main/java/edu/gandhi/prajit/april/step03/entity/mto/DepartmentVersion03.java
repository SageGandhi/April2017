package edu.gandhi.prajit.april.step03.entity.mto;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class DepartmentVersion03 {
	@Id
	@GeneratedValue
	private Long id;
	@OneToMany
	private Collection<EmployeeVersion03> employeeVersion03s;

	/**
	 * @return the employeeVersion03s
	 */
	public final Collection<EmployeeVersion03> getEmployeeVersion03s() {
		return employeeVersion03s;
	}

	/**
	 * @param employeeVersion03s the employeeVersion03s to set
	 */
	public final void setEmployeeVersion03s(Collection<EmployeeVersion03> employeeVersion03s) {
		this.employeeVersion03s = employeeVersion03s;
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
