package edu.gandhi.prajit.april.main.jpqlhql;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;

import edu.gandhi.prajit.april.dao.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.jpqlhql.entity00.Transaction;

public class HqlApplication02 {
	private static final String PositionalQuery00="Select transaction From Transaction transaction Where transaction.amount > ? and transaction.transactionType='Withdrawl'";
	private static final String NamedParamQuery00="Select transaction From Transaction transaction Where transaction.amount > :amount and transaction.transactionType='Withdrawl'";
	public static void main(String[] args) {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		final Scanner scannerInput=new Scanner(System.in);
		session.beginTransaction(); 
		
		final Query queryHibernate00 = session.createQuery(PositionalQuery00);
		System.out.println("Provide Amount");
		queryHibernate00.setParameter(0,new BigDecimal(scannerInput.next()));
		@SuppressWarnings("unchecked")
		final List<Transaction> transactions00 = queryHibernate00.list();
		for(final Transaction transaction : transactions00){
			System.out.println(transaction);
		}
		
		final Query queryHibernate01 = session.createQuery(NamedParamQuery00);
		System.out.println("Provide Amount");
		queryHibernate01.setParameter("amount",new BigDecimal(scannerInput.next()));
		@SuppressWarnings("unchecked")
		final List<Transaction> transactions01 = queryHibernate01.list();
		for(final Transaction transaction : transactions01){
			System.out.println(transaction);
		}
		session.getTransaction().commit();
		scannerInput.close();
		session.close();
	}
}