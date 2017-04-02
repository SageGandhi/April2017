package edu.gandhi.prajit.april.step05.jpql;

import java.sql.Date;
import java.text.MessageFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

import edu.gandhi.prajit.april.step01.entity.Book;
import edu.gandhi.prajit.april.step02.entity.Author;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class SampleStructureForJpqlQuery {
	public static void main(String[] args) throws Throwable {
		final EntityManager entityManager = Persistence.createEntityManagerFactory("<PersistenceUnitName>")
				.createEntityManager();
		/**
		 * Dynamic Query:Cost For Jpql String To Convert It Into Sql String At
		 * Runtime
		 */
		Query query00 = entityManager.createQuery("Select book From Book book Where book.id=247119");
		Book book00 = (Book) query00
				.getSingleResult();/** Throws @See {NonUniqueResultException} */
		System.out.println(MessageFormat.format("Book Found:{0}", book00));

		Query query01 = entityManager.createQuery("Select book From Book book");
		List<Book> book01 = query01.getResultList();/** UnTyped List Returned */
		System.out.println(MessageFormat.format("Books Found:{0}", book01));

		TypedQuery<Book> query02 = entityManager.createQuery("Select book From Book book", Book.class);
		List<Book> book02 = query02.getResultList();/** Typed List Returned */
		System.out.println(MessageFormat.format("Books Found:{0}", book02));

		/** Positional Binding */
		Query query03 = entityManager.createQuery("Select book From Book book Where book.id=?1");
		query03.setParameter(1, 247119);/** Setting Parameter */
		Book book03 = (Book) query03
				.getSingleResult();/** Throws @See {NonUniqueResultException} */
		System.out.println(MessageFormat.format("Book Found:{0}", book03));

		TypedQuery<Book> query04 = entityManager
				.createQuery("Select book From Book book Where book.id=?1", Book.class);
		query04.setParameter(1, 247119);
		List<Book> book04 = query04.getResultList();/** Typed List Returned */
		System.out.println(MessageFormat.format("Books Found:{0}", book04));

		/** Named Identifier */
		Query query05 = entityManager.createQuery("Select book From Book book Where book.id=:id");
		query05.setParameter("id", 247119);/** Setting Parameter */
		Book book05 = (Book) query05
				.getSingleResult();/** Throws @See {NonUniqueResultException} */
		System.out.println(MessageFormat.format("Book Found:{0}", book05));

		TypedQuery<Book> query06 = entityManager
				.createQuery("Select book From Book book Where book.id=:id", Book.class);
		query06.setParameter("id", 247119);
		List<Book> book06 = query06.getResultList();/** Typed List Returned */
		System.out.println(MessageFormat.format("Books Found:{0}", book06));

		/** If Parameter Type Temporal Example Shown Using Named Identifier */
		Query query07 = entityManager
				.createQuery("Select author From Author author Where author.dateOfBirth<:DateOfBirth");
		query07.setParameter("DateOfBirth", Date.class.newInstance(),
				TemporalType.DATE);/** Setting Parameter */
		Author author00 = (Author) query05.getResultList();
		System.out.println(MessageFormat.format("Author Found:{0}", author00));

		TypedQuery<Author> query08 = entityManager
				.createQuery("Select author From Author author Where author.dateOfBirth<:DateOfBirth", Author.class);
		/** Setting Temporal Parameter */
		query08.setParameter("DateOfBirth", Date.class.newInstance(), TemporalType.DATE);
		/**
		 * Fetch Max 100 Result Used For Pagination Along With
		 * query08.setFirstResult(50);
		 */
		query08.setMaxResults(100);
		/** Typed List Returned */
		List<Author> author01 = query08.getResultList();
		System.out.println(MessageFormat.format("Authors Found:{0}", author01));

		/**
		 * NamedQuery:Proider Translate Jpql String To Sql Once Application
		 * Starts: Defined In edu.gandhi.prajit.april.step02.entity.Author:
		 * Author.SortByAuthorName.Named, Author.SortByAuthorName.Positional.
		 * Same Way Pagination Works.NamedQuery Must Be Unique Within
		 * PersistentUnit.
		 */
		Query query09 = entityManager.createNamedQuery("Author.SortByAuthorName.Positional");
		query09.setParameter(1, 10);
		List author02 = query09.getResultList();
		System.out.println(MessageFormat.format("Authors Found:{0}", author02));

		TypedQuery<Author> query10 = entityManager.createNamedQuery("Author.SortByAuthorName.Named", Author.class);
		query10.setParameter("Age", 10);
		List<Author> author03 = query10.getResultList();
		System.out.println(MessageFormat.format("Authors Found:{0}", author03));
	}
}