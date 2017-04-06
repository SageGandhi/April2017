package edu.gandhi.prajit.april.main.jpqlhql;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.gandhi.prajit.april.dao.util.QueryConstant;
import edu.gandhi.prajit.april.jpqlhql.entity00.Account;

public class JpqlApplication05 {
	public static void main(String[] args) {
		final EntityManager entityManager = Persistence.createEntityManagerFactory("InfiniteFinances").createEntityManager();
		entityManager.getTransaction().begin();
		
		final TypedQuery<Account> typedAccount=entityManager.createNamedQuery(QueryConstant.AccountJpaDepositAbove500,Account.class);
		final List<Account> accounts = typedAccount.getResultList();
		for(final Account account : accounts){
			System.out.println(MessageFormat.format("Account Name:{0}",account));			
		}
		
		final TypedQuery<Object[]> typedNameBankState=entityManager.createNamedQuery(QueryConstant.AccountJpaNameBankState,Object[].class);
		typedNameBankState.setParameter("amount",BigDecimal.valueOf(99d));
		typedNameBankState.setParameter(1,"Deposit");
		final List<Object[]> nameBankStates = typedNameBankState.getResultList();
		for(final Object[] nameBankState : nameBankStates){
			System.out.println(MessageFormat.format("Account Name:{0}",nameBankState[0]));
			System.out.println(MessageFormat.format("Bank Name~State:{0}",nameBankState[1]));
		}
		
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}