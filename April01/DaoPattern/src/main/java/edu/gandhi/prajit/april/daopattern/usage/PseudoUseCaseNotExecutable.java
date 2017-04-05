package edu.gandhi.prajit.april.daopattern.usage;

import java.util.Date;

import org.hibernate.Session;

import edu.gandhi.prajit.april.dao.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.daopattern.UserDao;
import edu.gandhi.prajit.april.daopattern.entity.Credential;
import edu.gandhi.prajit.april.daopattern.entity.User;
import edu.gandhi.prajit.april.daopattern.impl.UserHibernateDao;

public class PseudoUseCaseNotExecutable {
	public static void main(String[] args) {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		try {
			final UserDao userDao = new UserHibernateDao();
			//Use Dependency Injection
			userDao.setSession(session);
			
			session.beginTransaction();
			//Create User
			final User user = new User();
			user.setBirthDate(Date.class.newInstance());
			user.setCreatedBy("Prajit");
			user.setCreatedDate(Date.class.newInstance());
			user.setEmailAddress("prajit.ju@gmail.com");
			user.setFirstName("Prajit");
			user.setLastName("Gandhi");
			user.setLastUpdatedBy("prajit.ju@gmail.com");
			user.setLastUpdatedDate(Date.class.newInstance());
			//Create Credential
			final Credential credential = new Credential();
			credential.setPassword("namdetahole");
			credential.setUsername("lullaby");
			/** Developer Have To Manage Both Side Of The Relation While Saving */
			credential.setUser(user);
			user.setCredential(credential);
			//Save User
			userDao.save(user);
			session.getTransaction().commit();//Commit If All Good
		} catch (Exception exception) {
			exception.printStackTrace();
			session.getTransaction().rollback();//RollBack If Required
		} finally {
			session.close();			
		}
	}
}