package edu.gandhi.prajit.april.hiberop;

import java.text.MessageFormat;
import java.util.Date;

import org.hibernate.Session;

import edu.gandhi.prajit.april.chapter01.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.chapter10.entity.mtmbi.Bank;

public class HibernateOpsDetachedAttached00 {
	public static void main(String[] args) throws Exception {
		final Session session00 = HibernateUtilForXml.getSessionFactory().openSession();
		session00.beginTransaction();

		final Bank bankWillBeDetached = (Bank) session00.get(Bank.class, 1L);
		System.out.println(MessageFormat.format("After Method Invoked:{0}", session00.contains(bankWillBeDetached)));

		session00.getTransaction().commit();
		session00.close();

		final Bank transientBank = createBank();

		final Session session01 = HibernateUtilForXml.getSessionFactory().openSession();
		session01.beginTransaction();

		/**
		 * Presence Of Id Value In An Entity Determines Whether To Insert/Update
		 */
		System.out.println(MessageFormat.format("Before Method Invoked:{0}", session01.contains(bankWillBeDetached)));
		System.out.println(MessageFormat.format("Before Method Invoked:{0}", session01.contains(transientBank)));
		session01.saveOrUpdate(transientBank);
		session01.saveOrUpdate(bankWillBeDetached);
		bankWillBeDetached.setName("DirtyBitSetBank");
		System.out.println(MessageFormat.format("After Method Invoked:{0}", session01.contains(bankWillBeDetached)));
		System.out.println(MessageFormat.format("Before Method Invoked:{0}", session01.contains(transientBank)));

		session01.getTransaction().commit();
		session01.close();
		/**
		 * Flush Took All The Changes In The Persistence Context & Sync With
		 * Underlying Database.Flush Will Occured In 3 Way:Session.flush(),
		 * Transaction.commit()&Select Operation[May Be Due To Refresh]
		 */

		final Session session02 = HibernateUtilForXml.getSessionFactory().openSession();
		session02.beginTransaction();
		final Bank bankByFlush = (Bank) session02.get(Bank.class, 1L);
		bankByFlush.setName("JhikoJhiko");//Making Entity Dirty
		System.out.println("Before Calling Session.flush()");
		session02.flush();
		System.out.println("After Calling Session.flush()");
		bankByFlush.getAddress().setCity("Asansol");//Making Entity Dirty Again
		System.out.println("Before Calling Session.getTransaction().commit()");
		session02.getTransaction().commit();
		System.out.println("After Calling Session.getTransaction().commit()");
		session02.close();
		
		HibernateUtilForXml.getSessionFactory().close();
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	private static Bank createBank() throws Exception {
		final Bank bank = new Bank();
		bank.setName("First United Federal");
		bank.getAddress().setAddressLine1("103 Washington Plaza");
		bank.getAddress().setAddressLine2("Suite 332");
		bank.getAddress().setAddressType("PRIMARY");
		bank.getAddress().setCity("New York");
		bank.setCreatedBy("Prajit Gandhi");
		bank.setCreatedDate(Date.class.newInstance());
		bank.setInternational(false);
		bank.setLastUpdatedBy("Prajit Gandhi");
		bank.setLastUpdatedDate(Date.class.newInstance());
		bank.getAddress().setState("NY");
		bank.getAddress().setZipCode("10000");
		return bank;
	}
}