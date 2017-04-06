package edu.gandhi.prajit.april.main.criteriaquery;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import edu.gandhi.prajit.april.jpqlhql.entity00.Transaction;

public class JpqlApplicationPaging01 {
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
		criteriaQueryForTransaction.select(rootForTransaction);
		final TypedQuery<Transaction> allTransaction=entityManager.createQuery(criteriaQueryForTransaction);
		/**Pagination Happens Here On TypedQuery Interface:Start*/
		int pageNumber=2,pageSize=3;
		allTransaction.setFirstResult(((pageNumber-1)*pageSize))
			.setMaxResults(pageSize);
		/**Pagination Happens Here On TypedQuery Interface:End*/
		final List<Transaction> allTransResult = allTransaction.getResultList();
		for(final Transaction transaction : allTransResult){
			System.out.println(transaction);
		}
		
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}