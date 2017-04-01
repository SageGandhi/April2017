package edu.gandhi.prajit.april.step02;

import java.util.Date;

import edu.gandhi.prajit.april.step02.entity.Author;
import edu.gandhi.prajit.april.step02.entity.Author.Language;

public interface AuthorService {

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param bio
	 * @param dateOfBirth
	 * @param language
	 * @return
	 */
	Author createAuthorRecord(String firstName, String lastName, String bio, Date dateOfBirth, Language language);

	/**
	 * 
	 * @param author
	 * @return
	 */
	Author createNewAuthorRecord(Author author);

	/**
	 * 
	 * @param id
	 */
	void removeAuthor(Long id);

	/**
	 * 
	 * @param book
	 */
	void removeAuthor(Author author);

	/**
	 * 
	 * @param id
	 * @return
	 */
	Author findAuthor(Long id);

	/**
	 * 
	 * @param author
	 * @return
	 */
	Author findAuthor(Author author);

	/**
	 * 
	 * @param id
	 * @param biography
	 * @return
	 */
	Author updateAuthorBio(Long id, String biography);

	/**
	 * 
	 * @param author
	 * @param biography
	 * @return
	 */
	Author updateAuthorBio(Author author, String biography);
}