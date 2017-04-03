package edu.gandhi.prajit.april.appmain;

import java.util.Date;

import org.hibernate.Session;

import edu.gandhi.prajit.april.chapter01.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.chapter02.entity.Ver00.Address;
import edu.gandhi.prajit.april.chapter02.entity.Ver00.Bank;
import edu.gandhi.prajit.april.chapter02.entity.Ver00.User;

public class EmbeddableMainClass00 {
	public static void main(String[] args) throws Exception {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		session.getTransaction().begin();

		final User user = new User();
		user.setAge(28);
		user.setBirthDate(Date.class.newInstance());
		user.setCreatedBy("Prajit");
		user.setCreatedDate(Date.class.newInstance());
		user.setEmailAddress("prajit.ju@gmail.com");
		user.setFirstName("Prajit");
		user.setLastName("Gandhi");
		user.setLastUpdatedBy("prajit.ju@gmail.com");
		user.setLastUpdatedDate(Date.class.newInstance());

		final Address address = new Address();
		address.setAddressLine1("SampleAddressLine01");
		address.setAddressLine2("SampleAddressLine02");
		address.setCity("Philadelphia");
		address.setState("PA");
		address.setZipCode("12345");

		final Bank bank = new Bank();
		bank.setName("Gramin Bank");
		bank.setAddressLine1("SampleAddressLine01");
		bank.setAddressLine2("SampleAddressLine02");
		bank.setCity("New York");
		bank.setState("Ny");
		bank.setZipCode("12345");
		bank.setCreatedBy("Prajit");
		bank.setCreatedDate(Date.class.newInstance());
		bank.setLastUpdatedBy("prajit.ju@gmail.com");
		bank.setLastUpdatedDate(Date.class.newInstance());
		bank.setInternational(Boolean.FALSE);
		
		session.save(user);//Save User
		session.save(bank);//Save Bank
		session.getTransaction().commit();

		session.close();
		HibernateUtilForXml.getSessionFactory().close();
	}
}