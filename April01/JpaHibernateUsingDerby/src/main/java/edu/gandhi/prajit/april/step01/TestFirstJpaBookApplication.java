package edu.gandhi.prajit.april.step01;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import edu.gandhi.prajit.april.step01.entity.Book;

public class TestFirstJpaBookApplication {
	private static final String Description="Are you looking for a deeper understanding of the Java™.";
	private static final String Title="Effective Java (2nd Edition) 2nd Edition";
	public static void main(String[] args) {
		final EntityManager entityManager = Persistence
			.createEntityManagerFactory("JpaTryOut01")
			.createEntityManager();
		final Book bookToSave=new Book(9780321356680l,Title,Description,36.99f,"978-0321356680",346);
		
		entityManager.getTransaction().begin();
		entityManager.persist(bookToSave);
		entityManager.getTransaction().commit();
		
		final Book foundBook=entityManager.find(Book.class,9780321356680l);
		System.out.println(foundBook);
		entityManager.close();
	}
}
