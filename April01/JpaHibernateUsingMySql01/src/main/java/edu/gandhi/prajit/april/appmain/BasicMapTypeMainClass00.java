package edu.gandhi.prajit.april.appmain;

import java.util.Date;

import org.hibernate.Session;

import edu.gandhi.prajit.april.chapter01.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.chapter03.entity.Ver00.Address;
import edu.gandhi.prajit.april.chapter03.entity.Ver00.BankMapType;

public class BasicMapTypeMainClass00 {
	public static void main(String[] args) throws Exception {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		session.getTransaction().begin();

		final Address address = new Address();
		address.setAddressLine1("SampleAddressLine01");
		address.setAddressLine2("SampleAddressLine02");
		address.setCity("Philadelphia");
		address.setState("PA");
		address.setZipCode("12345");

		final BankMapType bank = new BankMapType();
		bank.setName("Gramin Bank");
		bank.getAddress().setAddressLine1("SampleAddressLine01");
		bank.getAddress().setAddressLine2("SampleAddressLine02");
		bank.getAddress().setCity("New York");
		bank.getAddress().setState("Ny");
		bank.getAddress().setZipCode("12345");
		bank.setCreatedBy("Prajit");
		bank.setCreatedDate(Date.class.newInstance());
		bank.setLastUpdatedBy("prajit.ju@gmail.com");
		bank.setLastUpdatedDate(Date.class.newInstance());
		bank.setInternational(Boolean.FALSE);

		bank.getContacts().put("Cxo", "Swagat");
		bank.getContacts().put("Ceo", "Srabani");
		bank.getContacts().put("Cto", "Prajit");

		session.save(bank);// Save Bank
		session.getTransaction().commit();

		session.close();
		HibernateUtilForXml.getSessionFactory().close();
	}
}