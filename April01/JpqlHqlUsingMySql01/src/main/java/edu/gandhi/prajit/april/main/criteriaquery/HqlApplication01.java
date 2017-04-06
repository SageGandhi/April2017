package edu.gandhi.prajit.april.main.criteriaquery;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import edu.gandhi.prajit.april.dao.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.jpqlhql.entity00.Transaction;

public class HqlApplication01 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		session.beginTransaction();
		/**To Build A Criterion Always Use Restrictions Class Factory Method*/
		final Criterion amountLessThan20=Restrictions.le("amount",BigDecimal.valueOf(20.00d));
		final Criterion transactionTypeWithdrawl=Restrictions.eq("transactionType","Withdrawl");
		
		final List<Transaction> transactions00 = session.createCriteria(Transaction.class)
				.add(amountLessThan20)
				.add(transactionTypeWithdrawl)
				.addOrder(Order.desc("title"))
				.list();
		for (final Transaction transaction : transactions00) {
			System.out.println(transaction);
		}
		
		final List<Transaction> transactions01 = session.createCriteria(Transaction.class)
				.add(Restrictions.and(amountLessThan20,transactionTypeWithdrawl))
				.addOrder(Order.desc("title"))
				.list();
		for (final Transaction transaction : transactions01) {
			System.out.println(transaction);
		}
		
		session.getTransaction().commit();
		session.close();
	}
}