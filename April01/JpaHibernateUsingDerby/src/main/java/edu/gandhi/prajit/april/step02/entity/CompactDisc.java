package edu.gandhi.prajit.april.step02.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CompactDisc {
	private Long id;
	private String title;
	private String description;
	private Float unitCost;
	private Float totalDuration;
	private String genre;
	@Override
	public String toString() {
		return "CompactDisc [" + (id != null ? "id=" + id + ", " : "") + (title != null ? "title=" + title + ", " : "")
				+ (description != null ? "description=" + description + ", " : "")
				+ (unitCost != null ? "unitCost=" + unitCost + ", " : "")
				+ (totalDuration != null ? "totalDuration=" + totalDuration + ", " : "")
				+ (genre != null ? "genre=" + genre : "") + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((totalDuration == null) ? 0 : totalDuration.hashCode());
		result = prime * result + ((unitCost == null) ? 0 : unitCost.hashCode());
		return result;
	}
	public CompactDisc() {
	}
	/**
	 * @param id
	 * @param title
	 * @param description
	 * @param unitCost
	 * @param totalDuration
	 * @param genre
	 */
	public CompactDisc(String title, String description, Float unitCost, Float totalDuration, String genre) {
		this.title = title;
		this.description = description;
		this.unitCost = unitCost;
		this.totalDuration = totalDuration;
		this.genre = genre;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof CompactDisc)) {
			return false;
		}
		CompactDisc other = (CompactDisc) obj;
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (genre == null) {
			if (other.genre != null) {
				return false;
			}
		} else if (!genre.equals(other.genre)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		if (totalDuration == null) {
			if (other.totalDuration != null) {
				return false;
			}
		} else if (!totalDuration.equals(other.totalDuration)) {
			return false;
		}
		if (unitCost == null) {
			if (other.unitCost != null) {
				return false;
			}
		} else if (!unitCost.equals(other.unitCost)) {
			return false;
		}
		return true;
	}
	/**
	 * @return the id
	 */
	@Id @GeneratedValue
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
	 * @return the title
	 */
	@Column(length=50)
	public final String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public final void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the description
	 */
	@Column(length=5000)
	public final String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public final void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the unitCost
	 */
	@Column(name="Price")
	public final Float getUnitCost() {
		return unitCost;
	}
	/**
	 * @param unitCost the unitCost to set
	 */
	public final void setUnitCost(Float unitCost) {
		this.unitCost = unitCost;
	}
	/**
	 * @return the totalDuration
	 */
	@Column(name="PlayTime")
	public final Float getTotalDuration() {
		return totalDuration;
	}
	/**
	 * @param totalDuration the totalDuration to set
	 */
	public final void setTotalDuration(Float totalDuration) {
		this.totalDuration = totalDuration;
	}
	/**
	 * @return the genre
	 */
	@Column(length=50)
	public final String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public final void setGenre(String genre) {
		this.genre = genre;
	}
}
