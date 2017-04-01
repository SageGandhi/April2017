package edu.gandhi.prajit.april.step03.entity.mto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 * CREATE TABLE EMPLOYEEVERSION01 (ID BIGINT NOT NULL, DEPARTMENTVERSION01_ID BIGINT, PRIMARY KEY (ID))
 * ALTER TABLE EMPLOYEEVERSION01 ADD CONSTRAINT MPLYDPRTMNTVRSN01D FOREIGN KEY (DEPARTMENTVERSION01_ID) REFERENCES DEPARTMENTVERSION01 (ID)
 */
@Entity
public class EmployeeVersion02 {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name="DeptId")
	private DepartmentVersion02 departmentVersion02;

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
	 * @return the departmentVersion02
	 */
	public final DepartmentVersion02 getDepartmentVersion02() {
		return departmentVersion02;
	}

	/**
	 * @param departmentVersion02 the departmentVersion02 to set
	 */
	public final void setDepartmentVersion02(DepartmentVersion02 departmentVersion02) {
		this.departmentVersion02 = departmentVersion02;
	}
}
