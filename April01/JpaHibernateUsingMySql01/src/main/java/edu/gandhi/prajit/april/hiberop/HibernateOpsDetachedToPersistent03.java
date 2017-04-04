package edu.gandhi.prajit.april.hiberop;

import java.text.MessageFormat;

import org.hibernate.Session;

import edu.gandhi.prajit.april.chapter01.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.chapter10.entity.mtmbi.Bank;

public class HibernateOpsDetachedToPersistent03 {
	public static void main(String[] args) throws Exception {
		final Session session00 = HibernateUtilForXml.getSessionFactory().openSession();
		session00.beginTransaction();
		
		final Bank bankWillBeDetached = (Bank) session00.get(Bank.class, 1L);
		System.out.println(MessageFormat.format("After Method Invoked:{0}",session00.contains(bankWillBeDetached)));
		
		session00.getTransaction().commit();
		session00.close();
		
		final Session session01 = HibernateUtilForXml.getSessionFactory().openSession();
		session01.beginTransaction();
		
		System.out.println(MessageFormat.format("Before Method Invoked:{0}",session01.contains(bankWillBeDetached)));
		session01.update(bankWillBeDetached);
		bankWillBeDetached.setName("DirtyBitSetBank");
		System.out.println(MessageFormat.format("After Method Invoked:{0}",session01.contains(bankWillBeDetached)));
		
		session01.getTransaction().commit();
		session01.close();
		
		HibernateUtilForXml.getSessionFactory().close();
	}
}