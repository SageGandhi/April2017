package edu.gandhi.prajit.april.step03.entity.oto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class EmployeeVersion02 {
	@Id
	@GeneratedValue
	private Long id;
	@OneToOne
	@JoinColumn(name = "ParkSpaceId")
	private ParkingSpaceVersion02 parkingSpaceVersion02;

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
	 * @return the parkingSpaceVersion02
	 */
	public final ParkingSpaceVersion02 getParkingSpaceVersion02() {
		return parkingSpaceVersion02;
	}

	/**
	 * @param parkingSpaceVersion02 the parkingSpaceVersion02 to set
	 */
	public final void setParkingSpaceVersion02(ParkingSpaceVersion02 parkingSpaceVersion02) {
		this.parkingSpaceVersion02 = parkingSpaceVersion02;
	}
}
