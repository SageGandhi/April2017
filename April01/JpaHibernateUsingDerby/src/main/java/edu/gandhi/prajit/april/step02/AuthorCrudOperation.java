package edu.gandhi.prajit.april.step02;

import java.util.Date;

import javax.persistence.EntityManager;

import edu.gandhi.prajit.april.step02.entity.Author;
import edu.gandhi.prajit.april.step02.entity.Author.Language;

public class AuthorCrudOperation implements AuthorService {

	private final EntityManager EntityManager;

	/**
	 * @param entityManager
	 */
	public AuthorCrudOperation(EntityManager entityManager) {
		this.EntityManager = entityManager;
	}

	/**
	 * @return the entityManager
	 */
	public final EntityManager getEntityManager() {
		return EntityManager;
	}

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param bio
	 * @param dateOfBirth
	 * @param language
	 * @return
	 */
	public Author createAuthorRecord(final String firstName, final String lastName, final String bio,
			final Date dateOfBirth, final Language language) {
		return createNewAuthorRecord(new Author(firstName, lastName, bio, dateOfBirth, language));
	}

	/**
	 * 
	 * @param author
	 * @return
	 */
	public Author createNewAuthorRecord(final Author author) {
		// User/Bean Managed Transaction:Start
		EntityManager.getTransaction().begin();
		// Now Book Is A Managed Entity
		EntityManager.persist(author);
		// User/Bean Managed Transaction:Commit
		EntityManager.getTransaction().commit();
		return author;
	}

	/**
	 * 
	 * @param id
	 */
	public void removeAuthor(final Long id) {
		final Author authorToBeRemoved = EntityManager.find(Author.class, id);
		// Don't Know For Sure If This Book Entity Is Managed,So We Can Not
		// Perform remove Until Its Managed
		if (authorToBeRemoved != null) {
			// User/Bean Managed Transaction:Start
			EntityManager.getTransaction().begin();
			EntityManager.remove(authorToBeRemoved);
			// User/Bean Managed Transaction:Commit
			EntityManager.getTransaction().commit();
		}
	}

	/**
	 * 
	 * @param book
	 */
	public void removeAuthor(final Author author) {
		// Don't Know For Sure If This Book Entity Is Managed,So We Can Not
		// Perform remove Until Its Managed
		final Author authorToBeRemoved = EntityManager.merge(author);
		// User/Bean Managed Transaction:Start
		EntityManager.getTransaction().begin();
		EntityManager.remove(authorToBeRemoved);
		// User/Bean Managed Transaction:Commit
		EntityManager.getTransaction().commit();
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Author findAuthor(final Long id) {
		return EntityManager.find(Author.class, id);
	}

	/**
	 * 
	 * @param author
	 * @return
	 */
	public Author findAuthor(final Author author) {
		return EntityManager.find(Author.class, author.getId());
	}

	/**
	 * 
	 * @param id
	 * @param biography
	 * @return
	 */
	public Author updateAuthorBio(final Long id, final String biography) {
		final Author authorManaged = EntityManager.find(Author.class, id);
		if (authorManaged != null) {
			// User/Bean Managed Transaction:Start
			EntityManager.getTransaction().begin();
			authorManaged.setBio(biography);
			// User/Bean Managed Transaction:Commit
			EntityManager.getTransaction().commit();

		}
		return authorManaged;
	}

	/**
	 * 
	 * @param author
	 * @param biography
	 * @return
	 */
	public Author updateAuthorBio(final Author author, final String biography) {
		final Author authorManaged = EntityManager.merge(author);
		// User/Bean Managed Transaction:Start
		EntityManager.getTransaction().begin();
		authorManaged.setBio(biography);
		// User/Bean Managed Transaction:Commit
		EntityManager.getTransaction().commit();
		return authorManaged;
	}

	/**
	 * Closing EntityManager
	 */
	public void shutDownService() {
		EntityManager.close();
	}
}
