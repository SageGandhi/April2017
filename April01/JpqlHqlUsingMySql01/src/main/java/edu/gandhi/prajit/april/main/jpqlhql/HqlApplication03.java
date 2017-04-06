package edu.gandhi.prajit.april.main.jpqlhql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import edu.gandhi.prajit.april.dao.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.jpqlhql.entity00.Account;

public class HqlApplication03 {
	private static final String Query00="Select distinct transaction.account From Transaction transaction Where transaction.amount > 500 and transaction.transactionType='Deposit'";
	public static void main(String[] args) {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		session.beginTransaction(); 
		
		/**This Is Called Implicit Join As In Entity RelationShip,No Join Keyword Used*/
		final Query queryHibernate00 = session.createQuery(Query00);
		@SuppressWarnings("unchecked")
		/**List Of Account Will Be Returned*/
		final List<Account> accounts00 = queryHibernate00.list();
		for(final Account account : accounts00){
			System.out.println(account);
		}

		session.getTransaction().commit();
		session.close();
	}
}