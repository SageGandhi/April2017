package edu.gandhi.prajit.april.step03.entity.oto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ParkingSpaceVersion02 {
	@Id
	@GeneratedValue
	private Long id;
	@OneToOne(mappedBy = "parkingSpaceVersion02")
	private EmployeeVersion02 employeeVersion02;

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
	 * @return the employeeVersion02
	 */
	public final EmployeeVersion02 getEmployeeVersion02() {
		return employeeVersion02;
	}

	/**
	 * @param employeeVersion02
	 *            the employeeVersion02 to set
	 */
	public final void setEmployeeVersion02(EmployeeVersion02 employeeVersion02) {
		this.employeeVersion02 = employeeVersion02;
	}
}
