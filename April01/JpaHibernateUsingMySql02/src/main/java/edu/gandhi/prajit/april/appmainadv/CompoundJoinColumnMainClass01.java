package edu.gandhi.prajit.april.appmainadv;

import java.text.MessageFormat;

import org.hibernate.Session;

import edu.gandhi.prajit.april.chapter01.adventity.Currency;
import edu.gandhi.prajit.april.chapter01.adventity.Market;

public class CompoundJoinColumnMainClass01 {
	public static void main(String[] args) throws Exception {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		// Clean Currency,Market Table Before Start
		session.getTransaction().begin();

		final Currency currency = new Currency();
		currency.setCountryName("United Kingdom");
		currency.setName("Pound");
		currency.setSymbol("Pound Sign");

		final Market market = new Market();
		market.setMarketName("London Stock Exchange");
		market.setCurrency(currency);
		session.persist(market);

		session.getTransaction().commit();

		final Market findMarket = (Market) session.get(Market.class,market.getMarketId());
		System.out.println(MessageFormat.format("Market:{0}", findMarket.getCurrency()));
		session.close();
		HibernateUtilForXml.getSessionFactory().close();
	}
}