package edu.gandhi.prajit.april.step04.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import edu.gandhi.prajit.april.annotation.ToDo;

@Entity
public class CompactDiscVersion00 extends Item {
	private Float totalDuration;
	private String genre;
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn
	@ToDo("Use JoinColumn With Column Name,Remove JoinColumn Defaulted To JoinTable.Try Different Variation Of @Inheritance")
	private Set<edu.gandhi.prajit.april.step04.entity.Musician00> musicians = new HashSet<>();

	public CompactDiscVersion00() {
	}

	/**
	 * 
	 * @param title
	 */
	public CompactDiscVersion00(String title) {
		this.title = title;
	}

	/**
	 * 
	 * @param title
	 * @param genre
	 */
	public CompactDiscVersion00(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}

	/**
	 * 
	 * @param title
	 * @param description
	 * @param unitCost
	 * @param totalDuration
	 * @param genre
	 */
	public CompactDiscVersion00(String title, String description, Float unitCost, Float totalDuration, String genre) {
		this.title = title;
		this.description = description;
		this.unitCost = unitCost;
		this.totalDuration = totalDuration;
		this.genre = genre;
	}

	/**
	 * @return the totalDuration
	 */
	public final Float getTotalDuration() {
		return totalDuration;
	}

	/**
	 * @param totalDuration
	 *            the totalDuration to set
	 */
	public final void setTotalDuration(Float totalDuration) {
		this.totalDuration = totalDuration;
	}

	/**
	 * @return the genre
	 */
	public final String getGenre() {
		return genre;
	}

	/**
	 * @param genre
	 *            the genre to set
	 */
	public final void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * @return the musicians
	 */
	public final Set<edu.gandhi.prajit.april.step04.entity.Musician00> getMusicians() {
		return musicians;
	}

	/**
	 * @param musicians
	 *            the musicians to set
	 */
	public final void setMusicians(Set<edu.gandhi.prajit.april.step04.entity.Musician00> musicians) {
		this.musicians = musicians;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((musicians == null) ? 0 : musicians.hashCode());
		result = prime * result + ((totalDuration == null) ? 0 : totalDuration.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof CompactDiscVersion00)) {
			return false;
		}
		CompactDiscVersion00 other = (CompactDiscVersion00) obj;
		if (genre == null) {
			if (other.genre != null) {
				return false;
			}
		} else if (!genre.equals(other.genre)) {
			return false;
		}
		if (musicians == null) {
			if (other.musicians != null) {
				return false;
			}
		} else if (!musicians.equals(other.musicians)) {
			return false;
		}
		if (totalDuration == null) {
			if (other.totalDuration != null) {
				return false;
			}
		} else if (!totalDuration.equals(other.totalDuration)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "CompactDisc [" + (totalDuration != null ? "totalDuration=" + totalDuration + ", " : "")
				+ (genre != null ? "genre=" + genre + ", " : "") + (musicians != null ? "musicians=" + musicians : "")
				+ "]";
	}
}