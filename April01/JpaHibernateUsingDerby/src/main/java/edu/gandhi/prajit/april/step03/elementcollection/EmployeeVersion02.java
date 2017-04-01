package edu.gandhi.prajit.april.step03.elementcollection;

import java.util.Collection;

import javax.persistence.AttributeOverride;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EmployeeVersion02 {
	@Id
	private Long id;
	private String name;
	@ElementCollection(targetClass = VacationEntry.class)
	@CollectionTable(name = "EmpVacation", joinColumns = @JoinColumn(name = "EmpId"))
	@AttributeOverride(name="daysCount",column=@Column(name="Days"))
	private Collection<VacationEntry> vacationEntries;
	@ElementCollection
	@Column(name="Place")
	private Collection<String> places;
	@ManyToOne
	@JoinColumn(name="EmpId")
	private DepartmentVersion02 departmentVersion02;
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