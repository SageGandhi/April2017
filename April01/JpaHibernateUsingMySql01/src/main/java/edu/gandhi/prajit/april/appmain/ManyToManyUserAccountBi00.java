package edu.gandhi.prajit.april.appmain;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

import org.hibernate.Session;

import edu.gandhi.prajit.april.chapter01.util.HibernateUtilForXml;
import edu.gandhi.prajit.april.chapter10.entity.mtmbi.Account;
import edu.gandhi.prajit.april.chapter10.entity.mtmbi.Address;
import edu.gandhi.prajit.april.chapter10.entity.mtmbi.Credential;
import edu.gandhi.prajit.april.chapter10.entity.mtmbi.Transaction;
import edu.gandhi.prajit.april.chapter10.entity.mtmbi.User;


public class ManyToManyUserAccountBi00 {
	public static void main(String[] args) throws Exception {
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		session.getTransaction().begin();
		/**ManyToMany Account-->User,UniDirectional*/
		final Account account00=createNewAccount(),account01=createNewAccount();
		final User user00=createUser(),user01=createUser();
		
		account00.getUsers().add(user00);
		account00.getUsers().add(user01);
		
		account01.getUsers().add(user00);
		account01.getUsers().add(user01);
		
		user00.getAccounts().add(account00);
		user00.getAccounts().add(account01);
		
		user01.getAccounts().add(account00);
		user01.getAccounts().add(account01);

		session.save(user00);
		session.save(user01);
		
		session.getTransaction().commit();

		System.out.println(((Account)session.get(Account.class,
			account00.getAccountId())).getUsers().iterator().
			next().getEmailAddress());
		
		session.close();
		HibernateUtilForXml.getSessionFactory().close();
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unused")
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
	@SuppressWarnings("unused")
	private static Transaction createShoePurchase() throws Exception {
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

	/**
	 * 
	 * @param user
	 * @return
	 */
	private static Credential createCredential(User user) {
		Credential credential = new Credential();
		credential.setUser(user);
		credential.setUsername("namdiyechitahole");
		credential.setPassword("namdetahole");
		return credential;
	}

	/**
	 * 
	 * @return
	 */
	private static Address createAddress() {
		Address address = new Address();
		address.setAddressLine1("101 Address Line");
		address.setAddressLine2("102 Address Line");
		address.setCity("New York");
		address.setState("PA");
		address.setZipCode("10000");
		address.setAddressType("PRIMARY");
		return address;
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	private static User createUser() throws Exception {
		User user = new User();
		user.setAddresses(Arrays.asList(new Address[] { createAddress() }));
		user.setBirthDate(Date.class.newInstance());
		user.setCreatedBy("Kevin Bowersox");
		user.setCreatedDate(Date.class.newInstance());
		user.setCredential(createCredential(user));
		user.setEmailAddress("test@test.com");
		user.setFirstName("Prajit");
		user.setLastName("Sage");
		user.setLastUpdatedBy("System");
		user.setLastUpdatedDate(Date.class.newInstance());
		return user;
	}
}