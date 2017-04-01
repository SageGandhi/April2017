package edu.gandhi.prajit.april.step03.entity.oto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ParkingSpaceVersion01 {
	@Id
	@GeneratedValue
	private Long id;
}
