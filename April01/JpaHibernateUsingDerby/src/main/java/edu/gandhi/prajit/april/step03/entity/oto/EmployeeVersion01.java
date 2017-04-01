package edu.gandhi.prajit.april.step03.entity.oto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class EmployeeVersion01 {
	@Id
	@GeneratedValue
	private Long id;
	@OneToOne
	@JoinColumn(name="ParkSpaceId")
	private ParkingSpaceVersion01 parkingSpaceVersion01;
	/**
	 * @return the id
	 */
	public final Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public final void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the parkingSpaceVersion01
	 */
	public final ParkingSpaceVersion01 getParkingSpaceVersion01() {
		return parkingSpaceVersion01;
	}
	/**
	 * @param parkingSpaceVersion01 the parkingSpaceVersion01 to set
	 */
	public final void setParkingSpaceVersion01(ParkingSpaceVersion01 parkingSpaceVersion01) {
		this.parkingSpaceVersion01 = parkingSpaceVersion01;
	}
}
