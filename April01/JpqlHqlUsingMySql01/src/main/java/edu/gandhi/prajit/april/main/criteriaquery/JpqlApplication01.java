package edu.gandhi.prajit.april.main.criteriaquery;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

import edu.gandhi.prajit.april.jpqlhql.entity00.Transaction;

public class JpqlApplication01 {
	public static void main(String[] args) {
		final EntityManager entityManager = Persistence
			.createEntityManagerFactory("InfiniteFinances")
			.createEntityManager();
		entityManager.getTransaction().begin();
		
		/**CriteriaBuilder-->CriteriaQuery-->Root,CriteriaQuery & Root -->Entity Or Entity Attribute*/
		/**Retrieve Criteria Builder From EntityManager*/
		final CriteriaBuilder criteriaBuilder00=entityManager.getCriteriaBuilder();
		/**Defining Result Class Criteria May Return*/
		final CriteriaQuery<Transaction> criteriaQueryForTransaction=criteriaBuilder00.createQuery(Transaction.class);
		/**From Clause In Sql,Also Used For Aliasing Attribute*/
		final Root<Transaction> rootForTransaction=criteriaQueryForTransaction.from(Transaction.class);
		/**For Criteria We Need Path To Be Created From The Root*/
		Path<BigDecimal> amountPath=rootForTransaction.get("amount");
		Path<String> transactionTypePath=rootForTransaction.get("transactionType");
		/**Select Entity From The From Clause.Apply Path To Where Clause.For Restrictions We Have CriteriaBuilder Class*/
		criteriaQueryForTransaction.select(rootForTransaction).where(
			criteriaBuilder00.and(
				criteriaBuilder00.le(amountPath,BigDecimal.valueOf(20.00d)),
				criteriaBuilder00.equal(transactionTypePath,"Withdrawl")		
			));
		final TypedQuery<Transaction> allTransaction=entityManager.createQuery(criteriaQueryForTransaction);
		final List<Transaction> allTransResult = allTransaction.getResultList();
		for(final Transaction transaction : allTransResult){
			System.out.println(transaction);
		}
		
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}