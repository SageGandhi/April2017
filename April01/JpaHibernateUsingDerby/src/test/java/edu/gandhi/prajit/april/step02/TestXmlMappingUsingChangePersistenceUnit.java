package edu.gandhi.prajit.april.step02;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.gandhi.prajit.april.step02.entity.CompactDisc;

public class TestXmlMappingUsingChangePersistenceUnit {
	private static EntityManager EntityManager;
	private static EntityTransaction EntityTransaction;
	@Before
	public void setUp(){
		//EntityManager=Persistence.createEntityManagerFactory("JpaTryOut01").createEntityManager();
		EntityManager=Persistence.createEntityManagerFactory("JpaTryOut02ForMappingXml").createEntityManager();
		EntityTransaction=EntityManager.getTransaction();
	}
	@After
	public void tearDown(){
		EntityManager.close();
	}
	@Test
	public void compactDiscCreated(){
		CompactDisc disc= new CompactDisc("Selling England",
			"Progressive Rock Band Genesis", 12.5F, 53.39F,
			"Progressive Rock");
		
		EntityTransaction.begin();
		EntityManager.persist(disc);
		EntityTransaction.commit();
	}
}
