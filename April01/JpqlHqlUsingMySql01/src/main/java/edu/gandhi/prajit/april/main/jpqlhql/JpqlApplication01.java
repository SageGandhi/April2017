package edu.gandhi.prajit.april.main.jpqlhql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import edu.gandhi.prajit.april.jpqlhql.entity00.Transaction;

public class JpqlApplication01 {
	/**Jpql WikiBook For Reference*/
	private static final String Query00="From Transaction transaction Where (transaction.amount between 75 and 100) and transaction.title like '%s' Order By transaction.title";
	public static void main(String[] args) {
		final EntityManager entityManager = Persistence
			.createEntityManagerFactory("InfiniteFinances")
			.createEntityManager();
		entityManager.getTransaction().begin();
		final Query queryJpql = entityManager.createQuery(Query00);
		@SuppressWarnings("unchecked")
		final List<Transaction> transactions00 = queryJpql.getResultList();
		for(final Transaction transaction : transactions00){
			System.out.println(transaction);
		}
		final TypedQuery<Transaction> typedQueryTransactions=entityManager.createQuery(Query00,Transaction.class);
		final List<Transaction> transactions01 = typedQueryTransactions.getResultList();
		for(final Transaction transaction : transactions01){
			System.out.println(transaction);
		}
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}