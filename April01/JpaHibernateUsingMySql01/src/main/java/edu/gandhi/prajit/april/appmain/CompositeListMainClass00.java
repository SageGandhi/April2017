package edu.gandhi.prajit.april.appmain;

import java.util.Date;

import org.hibernate.Session;

import edu.gandhi.prajit.april.chapter01.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.chapter03.entity.Ver00.Address;
import edu.gandhi.prajit.april.chapter03.entity.Ver00.UserCompositeList;

public class CompositeListMainClass00 {
	public static void main(String[] args) throws Exception {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		session.getTransaction().begin();

		final UserCompositeList user = new UserCompositeList();
		user.setAge(28);
		user.setBirthDate(Date.class.newInstance());
		user.setCreatedBy("Prajit");
		user.setCreatedDate(Date.class.newInstance());
		user.setEmailAddress("prajit.ju@gmail.com");
		user.setFirstName("Prajit");
		user.setLastName("Gandhi");
		user.setLastUpdatedBy("prajit.ju@gmail.com");
		user.setLastUpdatedDate(Date.class.newInstance());

		final Address address00 = new Address();
		address00.setAddressLine1("SampleAddressLine01");
		address00.setAddressLine2("SampleAddressLine02");
		address00.setCity("Philadelphia");
		address00.setState("PA");
		address00.setZipCode("12345");

		final Address address01 = new Address();
		address01.setAddressLine1("SampleAddressLine01");
		address01.setAddressLine2("SampleAddressLine02");
		address01.setCity("New York");
		address01.setState("Ny");
		address01.setZipCode("12345");
		
		user.getAddress().add(address00);
		user.getAddress().add(address01);

		session.save(user);
		session.getTransaction().commit();

		session.close();
		HibernateUtilForXml.getSessionFactory().close();
	}
}