package edu.gandhi.prajit.april.appmain;

import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import edu.gandhi.prajit.april.chapter01.entity.Ver00.User;
import edu.gandhi.prajit.april.chapter01.util.HibernateUtilForXml;

public class FormulaCalculationMainClass00 {
	public static void main(String[] args) throws Exception {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		final Calendar BirthDay = Calendar.getInstance();
		BirthDay.set(1988, 12, 22);
		System.out.println(MessageFormat.format("BirthDay:{0}", BirthDay));
		session.getTransaction().begin();
		
		final User user = User.class.newInstance();
		user.setBirthDate(BirthDay.getTime());
		user.setCreatedBy("Prajit");
		user.setCreatedDate(Date.class.newInstance());
		user.setEmailAddress("prajit.ju@gmail.com");
		user.setFirstName("Prajit");
		user.setLastName("Gandhi");
		user.setLastUpdatedBy("Prajit");
		user.setLastUpdatedDate(Date.class.newInstance());
		
		session.save(user);
		session.getTransaction().commit();
		System.out.println(MessageFormat.format("Before Refresh(Select):{0}",user.getAge()));
		session.refresh(user);
		System.out.println(MessageFormat.format("After Refresh(Select):{0}",user.getAge()));
		session.close();
		HibernateUtilForXml.getSessionFactory().close();
	}
}