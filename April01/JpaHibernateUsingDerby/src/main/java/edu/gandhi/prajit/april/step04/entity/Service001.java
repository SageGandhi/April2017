package edu.gandhi.prajit.april.step04.entity;

import javax.persistence.EntityManager;

public class Service001 {
	private EntityManager EntityManager;

	/**
	 * 
	 * @param em
	 */
	public Service001(EntityManager em) {
		this.EntityManager = em;
	}

	/**
	 * 
	 * @param cd
	 * @return
	 */
	public CompactDiscVersion01 createCompactDisc(CompactDiscVersion01 cd) {
		EntityManager.persist(cd);
		return cd;
	}

	/**
	 * 
	 * @param id
	 */
	public void removeCompactDisc(Long id) {
		CompactDiscVersion01 cd = EntityManager.find(CompactDiscVersion01.class, id);
		if (cd != null)
			EntityManager.remove(cd);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public CompactDiscVersion01 findCompactDisc(Long id) {
		return EntityManager.find(CompactDiscVersion01.class, id);
	}
}