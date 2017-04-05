package edu.gandhi.prajit.april.jpa.part00;

import java.text.MessageFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.gandhi.prajit.april.chapter10.entity.mtmbi.Bank;

public class JpaApplicationConfigurationMain {
	public static void main(String[] args) throws Exception {
		final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("InfiniteFinances");
		final EntityManager entityManager = entityManagerFactory.createEntityManager();
		final EntityTransaction entityTransaction = entityManager.getTransaction();
		try{
			final Bank bank00 = createBank();
			try{
				entityTransaction.begin();
				entityManager.persist(bank00);
				entityTransaction.commit();
			}catch (Exception exception) {
				entityTransaction.rollback();
				exception.printStackTrace();
			}	
			try{
				final Bank bank01 = entityManager.find(Bank.class, bank00.getBankId());
				System.out.println(MessageFormat.format("Entity Exists:{0}",entityManager.contains(bank01)));
		
				final Bank bank02 = entityManager.find(Bank.class,12453l);//If Not Found Returns Null
				System.out.println(MessageFormat.format("Entity Exists:{0}",entityManager.contains(bank02)));
			}catch (Exception exception) {
				exception.printStackTrace();
			}
			//If Not Found Throws EntityNotFoundException.Returns Proxy Until Demands. 
			final Bank bank03 = entityManager.getReference(Bank.class, bank00.getBankId());
			System.out.println(MessageFormat.format("Entity Exists:{0}",entityManager.contains(bank03)));
			System.out.println(MessageFormat.format("Entity Details:{0}",bank03));
			
			final Bank bank04 = entityManager.getReference(Bank.class,12453l);
			System.out.println(MessageFormat.format("Entity Exists:{0}",entityManager.contains(bank04)));
			System.out.println(MessageFormat.format("Entity Details:{0}",bank04));
		}catch (Exception exception) {
			exception.printStackTrace();
		}finally{
			entityManager.close();
			entityManagerFactory.close();
		}
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	private static Bank createBank() throws Exception {
		Bank bank = new Bank();
		bank.setName("First United Federal");
		bank.getAddress().setAddressLine1("103 Washington Plaza");
		bank.getAddress().setAddressLine2("Suite 332");
		bank.getAddress().setAddressType("PRIMARY");
		bank.getAddress().setCity("New York");
		bank.setCreatedBy("Prajit Gandhi");
		bank.setCreatedDate(Date.class.newInstance());
		bank.setInternational(false);
		bank.setLastUpdatedBy("Prajit Gandhi");
		bank.setLastUpdatedDate(Date.class.newInstance());
		bank.getAddress().setState("NY");
		bank.getAddress().setZipCode("10000");
		return bank;
	}

}