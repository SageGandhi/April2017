package edu.gandhi.prajit.april.hiberop;

import java.text.MessageFormat;

import org.hibernate.Session;

import edu.gandhi.prajit.april.chapter01.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.chapter10.entity.mtmbi.Bank;

public class HibernateOpsRetrieve00 {
	public static void main(String[] args) throws Exception {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();

		// Return Null If Not Found
		final Bank bank00 = (Bank) session.get(Bank.class, 1l);
		System.out.println(MessageFormat.format("Bank:{0}", bank00));
		// Select From Cache,Only One Query Execution
		final Bank bank01 = (Bank) session.get(Bank.class, 1l);
		System.out.println(MessageFormat.format("Bank:{0}", bank01));
		// Lazy Load,Hibernate Returns A Proxy,Until Needed.Comment Previous get
		// Action.
		final Bank bank02 = (Bank) session.load(Bank.class, 1l);
		System.out.println("Load Executed & Returns A Proxy");
		// Initializing proxy:
		// [edu.gandhi.prajit.april.chapter10.entity.mtmbi.Bank#123]		
		System.out.println(MessageFormat.format("Bank:{0}", bank02));
		// Return ObjectNotFoundException If Not Found
		final Bank bank03 = (Bank) session.load(Bank.class, 123l);
		// Initializing proxy:
		// [edu.gandhi.prajit.april.chapter10.entity.mtmbi.Bank#123]
		System.out.println("Load Executed & Returns A Proxy");
		// Caused by: org.hibernate.ObjectNotFoundException: No row with the
		// given identifier exists:
		// [edu.gandhi.prajit.april.chapter10.entity.mtmbi.Bank#123]
		System.out.println(MessageFormat.format("Bank:{0}", bank03));

		session.close();
		HibernateUtilForXml.getSessionFactory().close();
	}
}