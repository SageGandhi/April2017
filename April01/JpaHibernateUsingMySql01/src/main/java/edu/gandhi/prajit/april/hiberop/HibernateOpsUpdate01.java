package edu.gandhi.prajit.april.hiberop;

import java.util.Date;

import org.hibernate.Session;

import edu.gandhi.prajit.april.chapter01.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.chapter10.entity.mtmbi.Bank;

public class HibernateOpsUpdate01 {
	public static void main(String[] args) throws Exception {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		session.beginTransaction();
		
		final Bank bank = (Bank) session.get(Bank.class, 1L);
		bank.setName("New Hope Bank");
		bank.setLastUpdatedBy("Prajit Gandhi");
		bank.setLastUpdatedDate(Date.class.newInstance());

		session.getTransaction().commit();
		session.close();
		HibernateUtilForXml.getSessionFactory().close();
	}
}