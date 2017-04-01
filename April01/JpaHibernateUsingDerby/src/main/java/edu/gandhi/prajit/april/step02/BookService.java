package edu.gandhi.prajit.april.step02;

import edu.gandhi.prajit.april.step01.entity.Book;

public interface BookService {

	/**
	 * 
	 * @param id
	 * @param title
	 * @param description
	 * @param unitCost
	 * @param isbn
	 * @param numberOfPage
	 * @return
	 */
	Book createBookRecord(Long id, String title, String description, Float unitCost, String isbn, Integer numberOfPage);

	/**
	 * 
	 * @param book
	 * @return
	 */
	Book createNewBookRecord(Book book);

	/**
	 * 
	 * @param id
	 */
	void removeBook(Long id);

	/**
	 * 
	 * @param book
	 */
	void removeBook(Book book);

	/**
	 * 
	 * @param id
	 * @return
	 */
	Book findBook(Long id);

	/**
	 * 
	 * @param book
	 * @return
	 */
	Book findBook(Book book);

	/**
	 * 
	 * @param id
	 * @param increaseCost
	 * @return
	 */
	Book updateBookCost(Long id, Float increaseCost);

	/**
	 * 
	 * @param book
	 * @param increaseCost
	 * @return
	 */
	Book updateBookCost(Book book, Float increaseCost);	
}