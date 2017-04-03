package edu.gandhi.prajit.april.chapter01.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtilForXml {
	private static final String Hibernate_ConfigXml = "hibernate.cfg.xml";
	private static final SessionFactory SessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration configuration = new Configuration();
			return configuration.addResource(Hibernate_ConfigXml).configure()
				.buildSessionFactory(new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build());
		} catch (Exception exception) {
			exception.printStackTrace();
			throw new RuntimeException("There Was An Error Building The Factory", exception);
		}
	}

	public static SessionFactory getSessionFactory() {
		return SessionFactory;
	}
}