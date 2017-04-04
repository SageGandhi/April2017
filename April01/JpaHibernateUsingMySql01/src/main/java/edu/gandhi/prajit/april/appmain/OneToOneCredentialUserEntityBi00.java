package edu.gandhi.prajit.april.appmain;

import java.text.MessageFormat;
import java.util.Date;

import org.hibernate.Session;

import edu.gandhi.prajit.april.chapter01.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.chapter05.entitybioto.Credential;
import edu.gandhi.prajit.april.chapter05.entitybioto.User;

public class OneToOneCredentialUserEntityBi00 {
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
		/** Developer Have To Manage Both Side Of The Relation While Saving */
		credential.setUser(user);
		user.setCredential(credential);

		session.save(credential);
		session.getTransaction().commit();
		
		System.out.println(MessageFormat.format("EmailAddress:{0}",
			((User)session.get(User.class,credential.getUser().getUserId()))
			.getEmailAddress()));
		
		session.close();
		HibernateUtilForXml.getSessionFactory().close();
	}
}