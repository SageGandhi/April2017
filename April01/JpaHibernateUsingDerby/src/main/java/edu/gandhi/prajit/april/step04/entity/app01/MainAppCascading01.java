package edu.gandhi.prajit.april.step04.entity.app01;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.gandhi.prajit.april.annotation.ToDo;
import edu.gandhi.prajit.april.step04.entity.CompactDiscVersion01;
import edu.gandhi.prajit.april.step04.entity.Musician;
import edu.gandhi.prajit.april.step04.entity.Service001;

public class MainAppCascading01 {
	@ToDo("Error:Not Marked Cascade Persist.@OneToMany(cascade=CascadeType.PERSIST) In edu.gandhi.prajit.april.step04.entity.CompactDiscVersion01.")
	public static void main(String[] args) {
		final EntityManager entityManager = Persistence.createEntityManagerFactory("JpaTryOut01Relationship01")
				.createEntityManager();
		final EntityTransaction entityTransaction = entityManager.getTransaction();
		final Service001 service = new Service001(entityManager);

		entityTransaction.begin();
		Set<Musician> beatles = new HashSet<>();
		beatles.add(new Musician("John", "Lennon"));
		beatles.add(new Musician("Paul", "McCartney"));
		beatles.add(new Musician("Ringo", "Starr"));
		beatles.add(new Musician("Georges", "Harrison"));

		CompactDiscVersion01 sergentPepper = new CompactDiscVersion01("Sergent Pepper");
		sergentPepper.setMusicians(beatles);
		sergentPepper = service.createCompactDisc(sergentPepper);
		entityTransaction.commit();
		
		System.out.println(MessageFormat.format("Persisted:{0}", sergentPepper));

		sergentPepper = service.findCompactDisc(sergentPepper.getId());
		System.out.println(MessageFormat.format("Found:{0}", sergentPepper));
		System.out.println(MessageFormat.format("Musicians :{0}", sergentPepper.getMusicians()));

		entityTransaction.begin();
		service.removeCompactDisc(sergentPepper.getId());
		entityTransaction.commit();

		sergentPepper = service.findCompactDisc(sergentPepper.getId());
		System.out.println(MessageFormat.format("Found:{0}", sergentPepper));
		entityManager.close();
	}
}
