package edu.gandhi.prajit.april.main.jpqlhql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.gandhi.prajit.april.jpqlhql.entity00.Account;

public class JpqlApplication03 {
	/**Explicit Join Keyword*/
	private static final String Query00="Select distinct account From Transaction transaction join transaction.account account Where transaction.amount > 500 and transaction.transactionType='Deposit'";
	public static void main(String[] args) {
		final EntityManager entityManager = Persistence.createEntityManagerFactory("InfiniteFinances").createEntityManager();
		entityManager.getTransaction().begin();
		
		final TypedQuery<Account> typedQueryAccounts00=entityManager.createQuery(Query00,Account.class);
		final List<Account> accounts00 = typedQueryAccounts00.getResultList();
		for(final Account account : accounts00){
			System.out.println(account);
		}
		
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}