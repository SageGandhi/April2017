package edu.gandhi.prajit.april.step03.elementcollection;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

@Entity
public class DepartmentVersion02 {
	@Id
	@GeneratedValue
	private Long id;
	@OneToMany(mappedBy="departmentVersion02")
	@OrderColumn(name="EmployeeOrder")
	private List<EmployeeVersion02> employeeVersion02s;
	
	/**
	 * @return the employeeVersion02s
	 */
	public final List<EmployeeVersion02> getEmployeeVersion02s() {
		return employeeVersion02s;
	}

	/**
	 * @param employeeVersion02s the employeeVersion02s to set
	 */
	public final void setEmployeeVersion02s(List<EmployeeVersion02> employeeVersion02s) {
		this.employeeVersion02s = employeeVersion02s;
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
