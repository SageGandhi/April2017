package edu.gandhi.prajit.april.appmain;

import java.util.Date;

import org.hibernate.Session;

import edu.gandhi.prajit.april.chapter01.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.chapter04.entityunioto.Credential;
import edu.gandhi.prajit.april.chapter04.entityunioto.User;

public class OneToOneCredentialUserEntityMain00 {
	public static void main(String[] args) throws Exception {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		session.getTransaction().begin();

		final User user = new User();
		user.setBirthDate(Date.class.newInstance());
		user.setCreatedBy("Prajit");
		user.setCreatedDate(Date.class.newInstance());
		user.setEmailAddress("prajit.ju@gmail.com");
		user.setFirstName("Prajit");
		user.setLastName("Gandhi");
		user.setLastUpdatedBy("prajit.ju@gmail.com");
		user.setLastUpdatedDate(Date.class.newInstance());
		
		final Credential credential = new Credential();
		credential.setPassword("namdetahole");
		credential.setUsername("lullaby");
		credential.setUser(user);
		
		session.save(credential);
		session.getTransaction().commit();

		session.close();
		HibernateUtilForXml.getSessionFactory().close();
	}
}