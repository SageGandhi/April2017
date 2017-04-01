package edu.gandhi.prajit.april.step03.entity.mto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
/**
 * CREATE TABLE EMPLOYEEVERSION01 (ID BIGINT NOT NULL, DEPARTMENTVERSION01_ID BIGINT, PRIMARY KEY (ID))
 * ALTER TABLE EMPLOYEEVERSION01 ADD CONSTRAINT MPLYDPRTMNTVRSN01D FOREIGN KEY (DEPARTMENTVERSION01_ID) REFERENCES DEPARTMENTVERSION01 (ID)
 */
@Entity
public class EmployeeVersion01 {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	private DepartmentVersion01 departmentVersion01;

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
	 * @return the departmentVersion01
	 */
	public final DepartmentVersion01 getDepartmentVersion01() {
		return departmentVersion01;
	}

	/**
	 * @param departmentVersion01
	 *            the departmentVersion01 to set
	 */
	public final void setDepartmentVersion01(DepartmentVersion01 departmentVersion01) {
		this.departmentVersion01 = departmentVersion01;
	}
}
