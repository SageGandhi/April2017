package edu.gandhi.prajit.april.chapter01.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import edu.gandhi.prajit.april.chapter01.entity.Ver00.AccountType;
import edu.gandhi.prajit.april.chapter01.entity.Ver00.User;

public class HibernateUtilForProperties {
	private static final SessionFactory SessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration configuration = new Configuration();
			configuration.addAnnotatedClass(User.class);
			configuration.addAnnotatedClass(AccountType.class);
			return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
		} catch (Exception exception) {
			exception.printStackTrace();
			throw new RuntimeException("There Was An Error Building The Factory", exception);
		}
	}

	public static SessionFactory getSessionFactory() {
		return SessionFactory;
	}
}