package edu.gandhi.prajit.april.main.jpqlhql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import edu.gandhi.prajit.april.jpqlhql.entity00.Transaction;

public class JpqlApplication00 {
	public static void main(String[] args) {
		final EntityManager entityManager = Persistence
			.createEntityManagerFactory("InfiniteFinances")
			.createEntityManager();
		entityManager.getTransaction().begin();
		final Query queryJpql = entityManager.createQuery("From Transaction transaction Order By transaction.title");
		@SuppressWarnings("unchecked")
		final List<Transaction> transactions00 = queryJpql.getResultList();
		for(final Transaction transaction : transactions00){
			System.out.println(transaction);
		}
		final TypedQuery<Transaction> typedQueryTransactions=entityManager.createQuery(
				"From Transaction transaction Order By transaction.title",Transaction.class);
		final List<Transaction> transactions01 = typedQueryTransactions.getResultList();
		for(final Transaction transaction : transactions01){
			System.out.println(transaction);
		}
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}