package edu.gandhi.prajit.april.step04.entity.app01;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.gandhi.prajit.april.annotation.ToDo;
import edu.gandhi.prajit.april.step04.entity.CompactDiscVersion02;
import edu.gandhi.prajit.april.step04.entity.Musician02;

public class MainAppWithOutCascading {
	@ToDo("Error:Not Marked Cascade Persist.@OneToMany(cascade=CascadeType.PERSIST) In edu.gandhi.prajit.april.step04.entity.CompactDiscVersion01.")
	public static void main(String[] args) {
		final EntityManager entityManager = Persistence.createEntityManagerFactory("JpaTryOut01Relationship01")
				.createEntityManager();
		final EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		Set<Musician02> beatles = new HashSet<>();
		beatles.add(new Musician02("John", "Lennon"));
		beatles.add(new Musician02("Paul", "McCartney"));
		beatles.add(new Musician02("Ringo", "Starr"));
		beatles.add(new Musician02("Georges", "Harrison"));

		CompactDiscVersion02 sergentPepper = new CompactDiscVersion02("Sergent Pepper");
		sergentPepper.setMusicians(beatles);
		entityManager.persist(sergentPepper);
		for(Musician02 musician:sergentPepper.getMusicians()){
			entityManager.persist(musician);
		}
		entityTransaction.commit();
		
		System.out.println(MessageFormat.format("Persisted:{0}", sergentPepper));

		sergentPepper = entityManager.find(CompactDiscVersion02.class,sergentPepper.getId());
		System.out.println(MessageFormat.format("Found:{0}", sergentPepper));
		System.out.println(MessageFormat.format("Musicians :{0}", sergentPepper.getMusicians()));

		entityTransaction.begin();
		entityManager.remove(sergentPepper);
		entityTransaction.commit();

		sergentPepper = entityManager.find(CompactDiscVersion02.class,sergentPepper.getId());
		System.out.println(MessageFormat.format("Found:{0}", sergentPepper));
		entityManager.close();
	}
}
