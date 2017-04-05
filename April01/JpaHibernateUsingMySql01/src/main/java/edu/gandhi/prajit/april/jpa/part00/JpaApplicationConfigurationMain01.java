package edu.gandhi.prajit.april.jpa.part00;

import java.text.MessageFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.gandhi.prajit.april.chapter10.entity.mtmbi.Bank;

public class JpaApplicationConfigurationMain01 {
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
				//Comment Transaction To Check Update Not Happening
				entityTransaction.begin();
				System.out.println(MessageFormat.format("Entity Exists:{0}",entityManager.contains(bank01)));
				bank01.setName("GandhiBank-OnlyFor Gandhi's");//Making Entity Dirty
				//Comment Transaction To Check Update Not Happening
				entityTransaction.commit();
				
				System.out.println(MessageFormat.format("Entity Exists:{0}",entityManager.contains(bank01)));
				entityManager.clear();//Making All Entity Detached From Persitence Context
				System.out.println(MessageFormat.format("Entity Exists:{0}",entityManager.contains(bank01)));
				
				final Bank bank02 = entityManager.find(Bank.class, bank00.getBankId());
				System.out.println(MessageFormat.format("Entity Exists:{0}",entityManager.contains(bank02)));
				entityManager.detach(bank02);//Making Single Entity Detached From Persitence Context
				System.out.println(MessageFormat.format("Entity Exists:{0}",entityManager.contains(bank02)));
				
				entityTransaction.begin();
				System.out.println(MessageFormat.format("Entity Exists:{0}",entityManager.contains(bank02)));
				bank02.getContacts().put("MiCasa","Es Sucasa");
				final Bank bank03=entityManager.merge(bank02);
				System.out.println(MessageFormat.format("Entity Exists:{0}",entityManager.contains(bank02)));
				System.out.println(MessageFormat.format("Entity Exists:{0}",entityManager.contains(bank03)));
				entityTransaction.commit();
				
				entityTransaction.begin();
				System.out.println(MessageFormat.format("Entity Exists:{0}",entityManager.contains(bank02)));
				entityManager.remove(bank02);
				System.out.println(MessageFormat.format("Entity Exists:{0}",entityManager.contains(bank02)));
				entityTransaction.commit();
			}catch (Exception exception) {
				exception.printStackTrace();
			}			
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