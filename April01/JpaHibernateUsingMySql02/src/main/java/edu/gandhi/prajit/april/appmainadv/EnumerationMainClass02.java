package edu.gandhi.prajit.april.appmainadv;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.Date;

import org.hibernate.Session;

import edu.gandhi.prajit.april.chapter02.adventity.Account;
import edu.gandhi.prajit.april.chapter02.adventity.AccountType;

public class EnumerationMainClass02 {
	public static void main(String[] args) throws Exception {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		/**
		 * Execute This With @Enumerated(EnumType.STRING)
		 * & @Enumerated(EnumType.ORDINAL).Check Database.Problem Is Enumeration
		 * Changed Then Ordinal Value Changed As Well.
		 */
		session.getTransaction().begin();
		final Account account00 = createNewAccount();
		account00.setAccountType(AccountType.Savings);

		session.save(account00);
		session.getTransaction().commit();

		final Account account01 = (Account) session.get(Account.class, account00.getAccountId());
		System.out.println(MessageFormat.format("Enumeration:{0}", account01.getAccountType()));
		session.close();
		HibernateUtilForXml.getSessionFactory().close();
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	private static Account createNewAccount() throws Exception {
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