package edu.gandhi.prajit.april.step04.entity.app01;

import java.sql.SQLException;
import java.text.MessageFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.gandhi.prajit.april.step04.entity.CompactDiscVersion01;
import edu.gandhi.prajit.april.step04.entity.Service001;

public class MainAppInheritence01 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		final EntityManager entityManager = Persistence.createEntityManagerFactory("JpaTryOut01Relationship01")
				.createEntityManager();
		final EntityTransaction entityTransaction = entityManager.getTransaction();

		final Service001 service = new Service001(entityManager);

		entityTransaction.begin();
		CompactDiscVersion01 compactDisc = service.createCompactDisc(
				new CompactDiscVersion01("Selling England Pound", "Progressive Rock", 12.5F, 53.39F, "Progressive Rock"));
		entityTransaction.commit();
		System.out.println(MessageFormat.format("Persisted:{0}", compactDisc));

		compactDisc = service.findCompactDisc(compactDisc.getId());
		System.out.println(MessageFormat.format("Found:{0}", compactDisc));

		entityTransaction.begin();
		service.removeCompactDisc(compactDisc.getId());
		entityTransaction.commit();

		compactDisc = service.findCompactDisc(compactDisc.getId());
		System.out.println(MessageFormat.format("!Found:{0}", compactDisc));

		entityManager.close();
	}
}