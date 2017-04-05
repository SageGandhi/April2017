package edu.gandhi.prajit.april.appmainadv;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.Date;

import org.hibernate.Session;

import edu.gandhi.prajit.april.chapter03.adventity.Bond;
import edu.gandhi.prajit.april.chapter03.adventity.Stock;

public class MappedSuperClassMainClass03 {
	public static void main(String[] args) throws Exception {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		session.getTransaction().begin();
		
		final Stock stock=createStock();
		session.save(stock);
		
		final Bond bond=createBond();
		session.save(bond);
		
		session.getTransaction().commit();

		System.out.println(MessageFormat.format("Stock:{0}",stock));
		System.out.println(MessageFormat.format("Bond:{0}",bond));
		session.close();
		HibernateUtilForXml.getSessionFactory().close();
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	private static Bond createBond() throws Exception {
		Bond bond = new Bond();
		bond.setInterestRate(BigDecimal.valueOf(123.22d));
		bond.setIssuer("JP Morgan Chase");
		bond.setMaturityDate(Date.class.newInstance());
		bond.setPurchaseDate(Date.class.newInstance());
		bond.setName("Long Term Bond Purchases");
		bond.setValue(BigDecimal.valueOf(10.22d));
		return bond;
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	private static Stock createStock() throws Exception {
		Stock stock = new Stock();
		stock.setIssuer("Allen Edmonds");
		stock.setName("Private American Stock Purchases");
		stock.setPurchaseDate(Date.class.newInstance());
		stock.setQuantity(BigDecimal.valueOf(1922d));
		stock.setSharePrice(BigDecimal.valueOf(100.00d));
		return stock;
	}
}