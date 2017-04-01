package edu.gandhi.prajit.april.step02;

import java.text.MessageFormat;

import edu.gandhi.prajit.april.step01.TestFirstJpaBookApplication;
import edu.gandhi.prajit.april.step01.entity.Book;

public class CrudOperationMainApp {
	private final static BookService ServiceInstance = new BookCrudOperation();

	public static void main(String[] args) {
		ServiceInstance.createBookRecord(9780321356680l, TestFirstJpaBookApplication.Title,
				TestFirstJpaBookApplication.Description, 36.99f, "978-0321356680", 346);
		Book book=ServiceInstance.findBook(9780321356680l);
		System.out.println(MessageFormat.format("Book Found:{0}",book));
		
		book=ServiceInstance.updateBookCost(book,10.00f);
		System.out.println(MessageFormat.format("Book Updated:{0}",book));
		
		ServiceInstance.removeBook(book.getId());
		book=ServiceInstance.findBook(9780321356680l);
		System.out.println(MessageFormat.format("Book Found:{0}",book));
		
		ServiceInstance.shutDownService();
	}
}
