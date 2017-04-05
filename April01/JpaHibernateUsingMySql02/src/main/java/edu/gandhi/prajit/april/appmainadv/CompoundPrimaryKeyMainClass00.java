package edu.gandhi.prajit.april.appmainadv;

import java.text.MessageFormat;

import org.hibernate.Session;

import edu.gandhi.prajit.april.chapter00.adventity.Currency;
import edu.gandhi.prajit.april.chapter00.adventity.id.CurrencyCompoundId;

public class CompoundPrimaryKeyMainClass00 {
	public static void main(String[] args) throws Exception {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		//Clean Currency Table Before Start
		session.getTransaction().begin();
		final Currency currency=new Currency();
		currency.setCountryName("United States");
		currency.setName("Dollar");
		currency.setSymbol("$");
		session.persist(currency);
		session.getTransaction().commit();
		
		Currency findCurrency = (Currency)session.get(Currency.class,
			new CurrencyCompoundId("Dollar","United States"));
		
		System.out.println(MessageFormat.format("Currency:{0}",findCurrency));
		session.close();
		HibernateUtilForXml.getSessionFactory().close();
	}
}