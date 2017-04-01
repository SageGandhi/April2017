package edu.gandhi.prajit.april.step02;

import javax.persistence.EntityManager;

import edu.gandhi.prajit.april.step01.entity.Book;


public class BookCrudOperation implements BookService {
	private final EntityManager EntityManager;

	/**
	 * @param entityManager
	 */
	public BookCrudOperation(EntityManager entityManager) {
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
	 * @param id
	 * @param title
	 * @param description
	 * @param unitCost
	 * @param isbn
	 * @param numberOfPage
	 * @return
	 */
	public Book createBookRecord(final Long id,final String title,final String description,final Float unitCost,final String isbn,final Integer numberOfPage){
		return createNewBookRecord(new Book(id,title,description,unitCost,isbn,numberOfPage));
	}
	/**
	 * 
	 * @param book
	 * @return
	 */
	public Book createNewBookRecord(final Book book) {
		EntityManager.getTransaction().begin();//User/Bean Managed Transaction:Start 
		EntityManager.persist(book);//Now Book Is A Managed Entity
		EntityManager.getTransaction().commit();//User/Bean Managed Transaction:Commit
		return book;
	}
	/**
	 * 
	 * @param id
	 */
	public void removeBook(final Long id){
		final Book bookToBeRemoved=EntityManager.find(Book.class,id);
		//Can Return Null,By Doing A Find This Book Entity Will Be Managed,So We Can Perform remove
		if(bookToBeRemoved!=null){
			EntityManager.getTransaction().begin();//User/Bean Managed Transaction:Start
			EntityManager.remove(bookToBeRemoved);
			EntityManager.getTransaction().commit();//User/Bean Managed Transaction:Commit
		}
	}
	/**
	 * 
	 * @param book
	 */
	public void removeBook(final Book book){
		//Don't Know For Sure If This Book Entity Is Managed,So We Can Perform remove
		final Book bookToBeRemoved=EntityManager.merge(book);
		EntityManager.getTransaction().begin();//User/Bean Managed Transaction:Start
		EntityManager.remove(bookToBeRemoved);
		EntityManager.getTransaction().commit();//User/Bean Managed Transaction:Commit
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Book findBook(final Long id){
		return EntityManager.find(Book.class,id);
	}
	/**
	 * 
	 * @param book
	 * @return
	 */
	public Book findBook(final Book book){
		return EntityManager.find(Book.class,book.getId());
	}
	/**
	 * 
	 * @param id
	 * @param increaseCost
	 * @return
	 */
	public Book updateBookCost(final Long id,final Float increaseCost){
		final Book bookFound=EntityManager.find(Book.class,id);
		if(bookFound!=null){
			EntityManager.getTransaction().begin();//User/Bean Managed Transaction:Start
			bookFound.setUnitCost(bookFound.getUnitCost()+increaseCost);
			EntityManager.getTransaction().commit();//User/Bean Managed Transaction:Commit
		}
		return bookFound;
	}
	/**
	 * 
	 * @param book
	 * @param increaseCost
	 * @return
	 */
	public Book updateBookCost(final Book book,final Float increaseCost){
		final Book bookManaged=EntityManager.merge(book);
		EntityManager.getTransaction().begin();//User/Bean Managed Transaction:Start
		bookManaged.setUnitCost(bookManaged.getUnitCost()+increaseCost);
		EntityManager.getTransaction().commit();//User/Bean Managed Transaction:Commit
		return bookManaged;
	}
	/**
	 * Closing EntityManager
	 */
	public void shutDownService(){
		EntityManager.close();
	}
}
