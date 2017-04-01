package edu.gandhi.prajit.april.step02;

import java.text.MessageFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import edu.gandhi.prajit.april.step01.TestFirstJpaBookApplication;
import edu.gandhi.prajit.april.step01.entity.Book;
import edu.gandhi.prajit.april.step02.entity.Author;

public class CrudOperationMainApp {
	private final static EntityManager EntityManager = Persistence.createEntityManagerFactory("JpaTryOut01").createEntityManager();
	
	private final static BookService BookService = new BookCrudOperation(EntityManager);
	private final static AuthorService AuthorService = new AuthorCrudOperation(EntityManager);

	public static void main(String[] args) {
		BookService.createBookRecord(9780321356680l, TestFirstJpaBookApplication.Title,
				TestFirstJpaBookApplication.Description, 36.99f, "978-0321356680", 346);
		Book book=BookService.findBook(9780321356680l);
		System.out.println(MessageFormat.format("Book Found:{0}",book));
		
		book=BookService.updateBookCost(book,10.00f);
		System.out.println(MessageFormat.format("Book Updated:{0}",book));
		
		BookService.removeBook(book.getId());
		book=BookService.findBook(9780321356680l);
		System.out.println(MessageFormat.format("Book !Found:{0}",book));
		
		Author author=AuthorService.createAuthorRecord("Prajit","Gandhi","Being Human,Become Globe-Trotter",new Date(),Author.Language.Japanese);
		System.out.println(MessageFormat.format("Author Saved:{0}",author));
		
		author=AuthorService.findAuthor(author);
		System.out.println(MessageFormat.format("Author Found:{0}",author));
		
		AuthorService.removeAuthor(author);
		author=AuthorService.findAuthor(author);
		System.out.println(MessageFormat.format("Author !Found:{0}",author));
		
		EntityManager.close();
	}
}
