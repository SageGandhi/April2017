package edu.gandhi.prajit.april.step03.entity.mtm;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class EmployeeVersion02 {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToMany
	@JoinTable(name = "EmployeeProject",
		joinColumns = @JoinColumn(name = "EmpId"), 
		inverseJoinColumns = @JoinColumn(name = "ProjectId"))
	private Collection<ProjectVersion02> projectVersion02s;

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
	 * @return the projectVersion02s
	 */
	public final Collection<ProjectVersion02> getProjectVersion02s() {
		return projectVersion02s;
	}

	/**
	 * @param projectVersion02s
	 *            the projectVersion02s to set
	 */
	public final void setProjectVersion02s(Collection<ProjectVersion02> projectVersion02s) {
		this.projectVersion02s = projectVersion02s;
	}
}
