package edu.gandhi.prajit.april.step03.elementcollection;

import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EmployeeVersion01 {
	@Id
	private Long id;
	private String name;
	@ElementCollection(targetClass = VacationEntry.class)
	private Collection<VacationEntry> vacationEntries;
	@ElementCollection
	private Collection<String> places;
	@Embedded
	private AddressVersion01 addressVersion01;
	@ManyToOne
	@JoinColumn(name="EmpIdVersion01")
	private DepartmentVersion01 departmentVersion01;
	/**
	 * @return the addressVersion01
	 */
	public final AddressVersion01 getAddressVersion01() {
		return addressVersion01;
	}

	/**
	 * @param addressVersion01 the addressVersion01 to set
	 */
	public final void setAddressVersion01(AddressVersion01 addressVersion01) {
		this.addressVersion01 = addressVersion01;
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

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the vacationEntries
	 */
	public final Collection<VacationEntry> getVacationEntries() {
		return vacationEntries;
	}

	/**
	 * @param vacationEntries
	 *            the vacationEntries to set
	 */
	public final void setVacationEntries(Collection<VacationEntry> vacationEntries) {
		this.vacationEntries = vacationEntries;
	}

	/**
	 * @return the places
	 */
	public final Collection<String> getPlaces() {
		return places;
	}

	/**
	 * @param places
	 *            the places to set
	 */
	public final void setPlaces(Collection<String> places) {
		this.places = places;
	}
}