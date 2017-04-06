package edu.gandhi.prajit.april.main.jpqlhql;

import java.text.MessageFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JpqlApplication04 {
	/**Explicit Join Keyword & Concat Function Usage.Call It Projection.*/
	private static final String Query00="Select distinct transaction.account.name,concat(concat(transaction.account.bank.name,'~'),transaction.account.bank.address.state) "
			+ "From Transaction transaction Where transaction.amount > 500 and lower(transaction.transactionType)='deposit'";
	public static void main(String[] args) {
		final EntityManager entityManager = Persistence.createEntityManagerFactory("InfiniteFinances").createEntityManager();
		entityManager.getTransaction().begin();
		
		final TypedQuery<Object[]> typedNameBankState=entityManager.createQuery(Query00,Object[].class);
		final List<Object[]> nameBankStates = typedNameBankState.getResultList();
		for(final Object[] nameBankState : nameBankStates){
			System.out.println(MessageFormat.format("Account Name:{0}",nameBankState[0]));
			System.out.println(MessageFormat.format("Bank Name~State:{0}",nameBankState[1]));
		}
		
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}