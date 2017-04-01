package edu.gandhi.prajit.april.step01.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BookDetails",schema="APP")
public class Book {
	@Id private Long id;
	private String title;
	private String description;
	private Float unitCost;
	private String isbn;
	private Integer numberOfPage;
	
	@Override
	public String toString() {
		return "Book [" + (id != null ? "id=" + id + ", " : "") + (title != null ? "title=" + title + ", " : "")
				+ (description != null ? "description=" + description + ", " : "")
				+ (unitCost != null ? "unitCost=" + unitCost + ", " : "") + (isbn != null ? "isbn=" + isbn + ", " : "")
				+ (numberOfPage != null ? "numberOfPage=" + numberOfPage : "") + "]";
	}

	public Book() {
	}

	/**
	 * @param id
	 * @param title
	 * @param description
	 * @param unitCost
	 * @param isbn
	 * @param numberOfPage
	 */
	public Book(Long id, String title, String description, Float unitCost, String isbn, Integer numberOfPage) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.unitCost = unitCost;
		this.isbn = isbn;
		this.numberOfPage = numberOfPage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((numberOfPage == null) ? 0 : numberOfPage.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((unitCost == null) ? 0 : unitCost.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book) obj;
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (isbn == null) {
			if (other.isbn != null) {
				return false;
			}
		} else if (!isbn.equals(other.isbn)) {
			return false;
		}
		if (numberOfPage == null) {
			if (other.numberOfPage != null) {
				return false;
			}
		} else if (!numberOfPage.equals(other.numberOfPage)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
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
	 * @return the isbn
	 */
	public final String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public final void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the numberOfPage
	 */
	public final Integer getNumberOfPage() {
		return numberOfPage;
	}
	/**
	 * @param numberOfPage the numberOfPage to set
	 */
	public final void setNumberOfPage(Integer numberOfPage) {
		this.numberOfPage = numberOfPage;
	}
}
