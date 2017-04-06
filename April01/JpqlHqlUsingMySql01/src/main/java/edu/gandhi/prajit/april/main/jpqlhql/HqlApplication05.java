package edu.gandhi.prajit.april.main.jpqlhql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import edu.gandhi.prajit.april.dao.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.dao.util.QueryConstant;
import edu.gandhi.prajit.april.jpqlhql.entity00.Account;

public class HqlApplication05 {
	public static void main(String[] args) {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		session.beginTransaction(); 
		/**Some Performance Benefit Over Named Query.Already Prepared When Application Boots*/
		final Query queryHibernate00 = session.getNamedQuery(QueryConstant.AccountHibernateDepositAbove500);
		@SuppressWarnings("unchecked")
		final List<Account> accounts00 = queryHibernate00.list();
		for(final Account account : accounts00){
			System.out.println(account);
		}
		session.getTransaction().commit();
		session.close();
	}
}