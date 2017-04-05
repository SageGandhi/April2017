package edu.gandhi.prajit.april.jpa.part00;

import java.text.MessageFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.gandhi.prajit.april.chapter10.entity.mtmbi.Bank;

public class JpaApplicationConfigurationMain00 {
	public static void main(String[] args) throws Exception {
		final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("InfiniteFinances");
		final EntityManager entityManager = entityManagerFactory.createEntityManager();
		final EntityTransaction entityTransaction = entityManager.getTransaction();
		try{
			try{
				/*Update*/
				entityTransaction.begin();
				Bank bank01 = entityManager.find(Bank.class, 1l);
				//Comment Transaction To Check Update Not Happening
				System.out.println(MessageFormat.format("Entity Exists:24:{0}",entityManager.contains(bank01)));
				bank01.setName("GandhiBank-OnlyFor Gandhi's");//Making Entity Dirty
				//Comment Transaction To Check Update Not Happening
				entityTransaction.commit();
				
				//Making All Entity Detached From Persitence Context
				entityTransaction.begin();
				System.out.println(MessageFormat.format("Entity Exists:31:{0}",entityManager.contains(bank01)));
				entityManager.clear();
				System.out.println(MessageFormat.format("Entity Exists:33:{0}",entityManager.contains(bank01)));
				entityTransaction.commit();
				
				//Making Single Entity Detached From Persitence Context
				entityTransaction.begin();
				bank01 = entityManager.find(Bank.class, bank01.getBankId());
				System.out.println(MessageFormat.format("Entity Exists:39:{0}",entityManager.contains(bank01)));
				entityManager.detach(bank01);
				System.out.println(MessageFormat.format("Entity Exists:41:{0}",entityManager.contains(bank01)));
				
				//Made Some Update & Merge Entity
				System.out.println(MessageFormat.format("Entity Exists:44:{0}",entityManager.contains(bank01)));
				//After Changing To Fetch Type Eager,Collection Always Lazily Loaded
				/*bank01.setContacts(new HashMap<>());*/
				bank01.getContacts().put("MiCasa","Es Sucasa");
				bank01=entityManager.merge(bank01);
				System.out.println(MessageFormat.format("Entity Exists:48:{0}",entityManager.contains(bank01)));
				entityTransaction.commit();
				
				entityTransaction.begin();
				System.out.println(MessageFormat.format("Entity Exists:52:{0}",entityManager.contains(bank01)));
				entityManager.remove(bank01);//Must Be Managed Entity
				System.out.println(MessageFormat.format("Entity Exists:54:{0}",entityManager.contains(bank01)));
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
}