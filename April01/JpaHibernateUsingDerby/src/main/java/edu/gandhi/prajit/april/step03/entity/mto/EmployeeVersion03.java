package edu.gandhi.prajit.april.step03.entity.mto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EmployeeVersion03 {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	private DepartmentVersion03 departmentVersion03;

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
	 * @return the departmentVersion03
	 */
	public final DepartmentVersion03 getDepartmentVersion03() {
		return departmentVersion03;
	}

	/**
	 * @param departmentVersion03
	 *            the departmentVersion03 to set
	 */
	public final void setDepartmentVersion03(DepartmentVersion03 departmentVersion03) {
		this.departmentVersion03 = departmentVersion03;
	}
}
