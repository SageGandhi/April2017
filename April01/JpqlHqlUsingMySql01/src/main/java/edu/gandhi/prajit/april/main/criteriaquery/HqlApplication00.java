package edu.gandhi.prajit.april.main.criteriaquery;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import edu.gandhi.prajit.april.dao.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.jpqlhql.entity00.Transaction;

public class HqlApplication00 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		session.beginTransaction();
		
		final Query queryHibernate = session.createQuery("Select transaction From Transaction transaction");
		final List<Transaction> transactions = queryHibernate.list();
		for (final Transaction transaction : transactions) {
			System.out.println(transaction);
		}
		
		final List<Transaction> transactions00 = session.createCriteria(Transaction.class)
				.addOrder(Order.desc("title"))
				.list();
		for (final Transaction transaction : transactions00) {
			System.out.println(transaction);
		}
		
		session.getTransaction().commit();
		session.close();
	}
}