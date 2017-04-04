package edu.gandhi.prajit.april.hiberop;

import java.text.MessageFormat;

import org.hibernate.Session;

import edu.gandhi.prajit.april.chapter01.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.chapter10.entity.mtmbi.Bank;

public class HibernateOpsDelete02 {
	public static void main(String[] args) throws Exception {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		session.beginTransaction();
		
		final Bank bank = (Bank) session.get(Bank.class, 1L);
		System.out.println(MessageFormat.format("Before Method Invoked:{0}",session.contains(bank)));
		session.delete(bank);
		System.out.println(MessageFormat.format("After Method Invoked:{0}",session.contains(bank)));
		
		session.getTransaction().commit();
		session.close();
		HibernateUtilForXml.getSessionFactory().close();
	}
}