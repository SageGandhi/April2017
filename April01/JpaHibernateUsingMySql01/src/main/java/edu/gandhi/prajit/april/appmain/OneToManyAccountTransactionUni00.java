package edu.gandhi.prajit.april.appmain;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.Date;

import org.hibernate.Session;

import edu.gandhi.prajit.april.chapter01.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.chapter06.entityuniotm.Account;
import edu.gandhi.prajit.april.chapter06.entityuniotm.Transaction;

public class OneToManyAccountTransactionUni00 {
	public static void main(String[] args) throws Exception {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		session.getTransaction().begin();

		final Account account = createNewAccount();
		account.getTransactions().add(createNewBeltPurchase());
		account.getTransactions().add(createShoePurchase());

		session.save(account);
		session.getTransaction().commit();

		System.out.println(MessageFormat.format("Account:{0}",account));

		session.close();
		HibernateUtilForXml.getSessionFactory().close();
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	private static Transaction createNewBeltPurchase() throws Exception {
		final Transaction beltPurchase = new Transaction();
		beltPurchase.setTitle("Dress Belt");
		beltPurchase.setAmount(BigDecimal.valueOf(50.00d));
		beltPurchase.setClosingBalance(BigDecimal.valueOf(0.00d));
		beltPurchase.setCreatedBy("Prajit Gandhi");
		beltPurchase.setCreatedDate(Date.class.newInstance());
		beltPurchase.setInitialBalance(BigDecimal.valueOf(0.00d));
		beltPurchase.setLastUpdatedBy("Prajit Gandhi");
		beltPurchase.setLastUpdatedDate(Date.class.newInstance());
		beltPurchase.setNotes("New Dress Belt");
		beltPurchase.setTransactionType("Debit");
		return beltPurchase;
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	private static Transaction createShoePurchase()throws Exception {
		final Transaction shoePurchase = new Transaction();
		shoePurchase.setTitle("Work Shoes");
		shoePurchase.setAmount(BigDecimal.valueOf(100.00d));
		shoePurchase.setClosingBalance(BigDecimal.valueOf(0.00d));
		shoePurchase.setCreatedBy("Prajit Gandhi");
		shoePurchase.setCreatedDate(Date.class.newInstance());
		shoePurchase.setInitialBalance(BigDecimal.valueOf(0.00d));
		shoePurchase.setLastUpdatedBy("Prajit Gandhi");
		shoePurchase.setLastUpdatedDate(Date.class.newInstance());
		shoePurchase.setNotes("Nice Pair Of Shoes");
		shoePurchase.setTransactionType("Debit");
		return shoePurchase;
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	private static Account createNewAccount()throws Exception{
		final Account account = new Account();
		account.setCloseDate(Date.class.newInstance());
		account.setOpenDate(Date.class.newInstance());
		account.setCreatedBy("Prajit Gandhi");
		account.setInitialBalance(BigDecimal.valueOf(50.00d));
		account.setName("Savings Account");
		account.setCurrentBalance(BigDecimal.valueOf(100.00d));
		account.setLastUpdatedBy("Prajit Gandhi");
		account.setLastUpdatedDate(Date.class.newInstance());
		account.setCreatedDate(Date.class.newInstance());
		return account;
	}
}