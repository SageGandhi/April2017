package edu.gandhi.prajit.april.step04.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@DiscriminatorValue("Book")
public class Book extends Item {
	@Column(length = 15)
	private String isbn;

	@Column(name = "nb_of_pages")
	private Integer nbOfPage;

	@Column(name = "publication_date")
	@Temporal(TemporalType.DATE)
	private Date publicationDate;

	public Book() {
	}

	/**
	 * 
	 * @param title
	 */
	public Book(String title) {
		this.title = title;
	}

	/**
	 * 
	 * @param title
	 * @param isbn
	 */
	public Book(String title, String isbn) {
		this.title = title;
		this.isbn = isbn;
	}

	/**
	 * 
	 * @param title
	 * @param description
	 * @param unitCost
	 * @param isbn
	 * @param nbOfPage
	 * @param publicationDate
	 */
	public Book(String title, String description, Float unitCost, String isbn, Integer nbOfPage, Date publicationDate) {
		this.title = title;
		this.description = description;
		this.unitCost = unitCost;
		this.isbn = isbn;
		this.nbOfPage = nbOfPage;
		this.publicationDate = publicationDate;
	}

	@Override
	public String toString() {
		return "Book [" + (isbn != null ? "isbn=" + isbn + ", " : "")
				+ (nbOfPage != null ? "nbOfPage=" + nbOfPage + ", " : "")
				+ (publicationDate != null ? "publicationDate=" + publicationDate : "") + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((nbOfPage == null) ? 0 : nbOfPage.hashCode());
		result = prime * result + ((publicationDate == null) ? 0 : publicationDate.hashCode());
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
		if (!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book) obj;
		if (isbn == null) {
			if (other.isbn != null) {
				return false;
			}
		} else if (!isbn.equals(other.isbn)) {
			return false;
		}
		if (nbOfPage == null) {
			if (other.nbOfPage != null) {
				return false;
			}
		} else if (!nbOfPage.equals(other.nbOfPage)) {
			return false;
		}
		if (publicationDate == null) {
			if (other.publicationDate != null) {
				return false;
			}
		} else if (!publicationDate.equals(other.publicationDate)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the isbn
	 */
	public final String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn
	 *            the isbn to set
	 */
	public final void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the nbOfPage
	 */
	public final Integer getNbOfPage() {
		return nbOfPage;
	}

	/**
	 * @param nbOfPage
	 *            the nbOfPage to set
	 */
	public final void setNbOfPage(Integer nbOfPage) {
		this.nbOfPage = nbOfPage;
	}

	/**
	 * @return the publicationDate
	 */
	public final Date getPublicationDate() {
		return publicationDate;
	}

	/**
	 * @param publicationDate
	 *            the publicationDate to set
	 */
	public final void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}
}