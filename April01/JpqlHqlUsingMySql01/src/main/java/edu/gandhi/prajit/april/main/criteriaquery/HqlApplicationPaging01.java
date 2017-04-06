package edu.gandhi.prajit.april.main.criteriaquery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Order;

import edu.gandhi.prajit.april.dao.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.jpqlhql.entity00.Transaction;

public class HqlApplicationPaging01 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		session.beginTransaction();
		int pageNumber=2,pageSize=3;
		final List<Transaction> transactions00 = session.createCriteria(Transaction.class)
				.addOrder(Order.desc("title"))
				.setFirstResult(((pageNumber-1)*pageSize))
				.setMaxResults(pageSize)
				.list();
		for (final Transaction transaction : transactions00) {
			System.out.println(transaction);
		}
		
		session.getTransaction().commit();
		session.close();
	}
}