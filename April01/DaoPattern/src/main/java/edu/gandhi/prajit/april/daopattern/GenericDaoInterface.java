package edu.gandhi.prajit.april.daopattern;

import java.util.List;

import org.hibernate.Session;

public interface GenericDaoInterface<EntityType, EntityIdType> {
	/**
	 * 
	 * @param id
	 * @return
	 */
	public EntityType findById(EntityIdType id);

	/**
	 * 
	 * @return
	 */
	public List<EntityType> findAll();

	/**
	 * 
	 * @param entity
	 * @return
	 */
	public EntityType save(EntityType entity);

	/**
	 * 
	 * @param entity
	 */
	public void delete(EntityType entity);

	/**
	 * 
	 */
	public void flush();

	/**
	 * 
	 */
	public void clear();

	/**
	 * 
	 * @param session
	 */
	public void setSession(Session session);
}