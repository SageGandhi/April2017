package edu.gandhi.prajit.april.main.jpqlhql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import edu.gandhi.prajit.april.dao.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.dao.util.QueryConstant;
import edu.gandhi.prajit.april.jpqlhql.entity00.Account;
import edu.gandhi.prajit.april.jpqlhql.entity00.Bank;

public class HqlApplication06 {
	public static void main(String[] args) {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		session.beginTransaction();
		/**
		 * We Are Dealing With Transaction&Account Why Bank Related Query
		 * Executes?Because By Default @ManyToOne(fetch=FetchType.EAGER).
		 * Change @ManyToOne(fetch=FetchType.LAZY) In Account Entity @LineNo
		 * 46,Changed It Back To Default @ManyToOne(fetch=FetchType.EAGER).
		 */
		final Query queryHibernate00 = session.getNamedQuery(QueryConstant.AccountHibernateDepositAbove500);
		@SuppressWarnings("unchecked")
		final List<Account> accounts00 = queryHibernate00.list();
		System.out.println("Account Query Executed.");
		/** First Select Query For Account,Second Select Query For Bank */
		for (final Account account : accounts00) {
			System.out.println(account);
			/**
			 * Due To Lyad,Bank Entity Will Be Loaded Now,You See A Select Query
			 * For Bank
			 */
			System.out.println("Retrieving Bank From Account.");
			System.out.println(account.getBank());
			final Bank tempBank=account.getBank();
			/**Not Getting Value When FetchType Lazy.Why?Level 01 Will Explore This Issue.*/
			System.out.println(tempBank.getName());
			/**Not Getting Value When FetchType Lazy.Why?Level 01 Will Explore This Issue.*/
			System.out.println(tempBank.getAddress());
		}

		session.getTransaction().commit();
		session.close();
	}
}