package edu.gandhi.prajit.april.main.jpqlhql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import edu.gandhi.prajit.april.dao.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.jpqlhql.entity00.Transaction;

public class HqlApplication01 {
	/**Use 2 Single Quote To Escape Single Quote In String Literal.Goto Hibernate Doc Expression To Learn More*/
	private static final String Query00="Select transaction From Transaction transaction Where transaction.amount > 75 and transaction.transactionType='Withdrawl'";
	private static final String Query01="Select transaction From Transaction transaction Where transaction.amount < 25";
	public static void main(String[] args) {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		session.beginTransaction(); 
		
		final Query queryHibernate00 = session.createQuery(Query00);
		@SuppressWarnings("unchecked")
		final List<Transaction> transactions00 = queryHibernate00.list();
		for(final Transaction transaction : transactions00){
			System.out.println(transaction);
		}
		
		final Query queryHibernate01 = session.createQuery(Query01);
		@SuppressWarnings("unchecked")
		final List<Transaction> transactions01 = queryHibernate01.list();
		for(final Transaction transaction : transactions01){
			System.out.println(transaction);
		}
		session.getTransaction().commit();
		session.close();
	}
}