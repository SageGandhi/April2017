package edu.gandhi.prajit.april.main.jpqlhql;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.gandhi.prajit.april.jpqlhql.entity00.Transaction;

public class JpqlApplication02 {
	private static final String PositionalQuery00="From Transaction transaction Where (transaction.amount between ?1 and ?2) Order By transaction.title";
	private static final String NamedParamQuery00="From Transaction transaction Where (transaction.amount between :Amount01 and :Amount02) Order By transaction.title";
	public static void main(String[] args) {
		final Scanner scannerInput=new Scanner(System.in);
		final EntityManager entityManager = Persistence.createEntityManagerFactory("InfiniteFinances").createEntityManager();
		entityManager.getTransaction().begin();
		
		final TypedQuery<Transaction> typedQueryTransactions00=entityManager.createQuery(PositionalQuery00,Transaction.class);
		System.out.println("Provide Amount To Start With");
		typedQueryTransactions00.setParameter(1,new BigDecimal(scannerInput.next()));
		System.out.println("Provide Amount To End With");
		typedQueryTransactions00.setParameter(2,new BigDecimal(scannerInput.next()));
		final List<Transaction> transactions00 = typedQueryTransactions00.getResultList();
		for(final Transaction transaction : transactions00){
			System.out.println(transaction);
		}
		
		final TypedQuery<Transaction> typedQueryTransactions01=entityManager.createQuery(NamedParamQuery00,Transaction.class);
		System.out.println("Provide Amount To Start With");
		typedQueryTransactions01.setParameter("Amount01",new BigDecimal(scannerInput.next()));
		System.out.println("Provide Amount To End With");
		typedQueryTransactions01.setParameter("Amount02",new BigDecimal(scannerInput.next()));
		final List<Transaction> transactions01 = typedQueryTransactions01.getResultList();
		for(final Transaction transaction : transactions01){
			System.out.println(transaction);
		}
		entityManager.getTransaction().commit();
		scannerInput.close();
		entityManager.close();
	}
}