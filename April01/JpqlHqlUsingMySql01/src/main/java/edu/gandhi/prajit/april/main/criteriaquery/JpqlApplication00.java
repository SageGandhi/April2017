package edu.gandhi.prajit.april.main.criteriaquery;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import edu.gandhi.prajit.april.jpqlhql.entity00.Transaction;

public class JpqlApplication00 {
	public static void main(String[] args) {
		final EntityManager entityManager = Persistence
			.createEntityManagerFactory("InfiniteFinances")
			.createEntityManager();
		entityManager.getTransaction().begin();
		
		final TypedQuery<Transaction> typedQueryTransactions=entityManager.createQuery(
				"From Transaction transaction",Transaction.class);
		final List<Transaction> transactions01 = typedQueryTransactions.getResultList();
		for(final Transaction transaction : transactions01){
			System.out.println(transaction);
		}
		/**CriteriaBuilder-->CriteriaQuery-->Root,CriteriaQuery & Root -->Entity Or Entity Attribute*/
		/**Retrieve Criteria Builder From EntityManager*/
		final CriteriaBuilder criteriaBuilder00=entityManager.getCriteriaBuilder();
		/**Defining Result Class Criteria May Return*/
		final CriteriaQuery<Transaction> criteriaQueryForTransaction=criteriaBuilder00.createQuery(Transaction.class);
		/**From Clause In Sql,Also Used For Aliasing Attribute*/
		final Root<Transaction> rootForTransaction=criteriaQueryForTransaction.from(Transaction.class);
		/**Select Entity From The From Clause*/
		/*criteriaQueryForTransaction.select(rootForTransaction.get("title"));*/
		criteriaQueryForTransaction.select(rootForTransaction);
		final TypedQuery<Transaction> allTransaction=entityManager.createQuery(criteriaQueryForTransaction);
		final List<Transaction> allTransResult = allTransaction.getResultList();
		for(final Transaction transaction : allTransResult){
			System.out.println(transaction);
		}
		
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}