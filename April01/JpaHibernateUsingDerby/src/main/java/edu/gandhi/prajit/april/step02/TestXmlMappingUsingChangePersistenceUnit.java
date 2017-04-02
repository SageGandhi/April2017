package edu.gandhi.prajit.april.step02;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.gandhi.prajit.april.step02.entity.CompactDisc;

public class TestXmlMappingUsingChangePersistenceUnit {
	private static EntityManager EntityManager;
	private static EntityTransaction EntityTransaction;

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		EntityManager = Persistence.createEntityManagerFactory("JpaTryOut02ForMappingXml").createEntityManager();
		EntityTransaction = EntityManager.getTransaction();
		CompactDisc disc = new CompactDisc("Selling England", "Progressive Rock Band Genesis", 12.5F, 53.39F,
				"Progressive Rock");

		EntityTransaction.begin();
		EntityManager.persist(disc);
		EntityTransaction.commit();

		EntityManager.close();
	}
}