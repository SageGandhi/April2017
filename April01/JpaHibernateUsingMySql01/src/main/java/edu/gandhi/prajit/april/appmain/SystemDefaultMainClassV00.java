package edu.gandhi.prajit.april.appmain;

import java.util.Date;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import edu.gandhi.prajit.april.chapter01.entity.Ver00.AccountType;
/**Learn About NamingStrategy*/
public class SystemDefaultMainClassV00 {
	public static void main(String[] args) throws Exception {
		initJavaConfig();
	}

	private static void initJavaConfig() throws Exception {
		/**
		 * Configuration:Started Programmatic Configuration.Other Configuration
		 * Options Are Via hibernate.properties,hibernate.cfg.xml File.
		 */
		final Configuration Configuration = new Configuration();
		Configuration.addAnnotatedClass(AccountType.class);
		Configuration.setProperties(new Properties() {
			private static final long serialVersionUID = -2963772891277319372L;
			{
				put("hibernate.connection.username", "infinite");
				put("hibernate.connection.password", "skills");
				put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
				put("hibernate.connection.url", "jdbc:mysql://localhost:3306/ifinances");
			}
		});
		/** Configuration:End */
		/** SessionFactory:Started */
		final org.hibernate.SessionFactory SessionFactory = Configuration
				.buildSessionFactory(StandardServiceRegistryBuilder.class.newInstance()
						.applySettings(Configuration.getProperties()).build());
		final Session Session = SessionFactory.openSession();
		Session.beginTransaction();

		Session.save(new AccountType("Savings", Date.class.newInstance(), "Prajit Gandhi", Date.class.newInstance(),
				"Prajit Gandhi"));

		Session.getTransaction().commit();
		Session.close();
		SessionFactory.close();
		/** SessionFactory:Ended */
	}
}