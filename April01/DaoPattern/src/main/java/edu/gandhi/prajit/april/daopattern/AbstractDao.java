package edu.gandhi.prajit.april.daopattern;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.MessageFormat;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;

import edu.gandhi.prajit.april.dao.util.HibernateUtilForXml;

@SuppressWarnings("unchecked")
public abstract class AbstractDao<EntityType, EntityIdType> implements GenericDaoInterface<EntityType, EntityIdType> {
	private Class<EntityType> entityClass;
	private Class<EntityIdType> idClass;
	private Session session;

	/**
	 * @return the session
	 */
	public final Session getSession() {
		if (this.session == null) {
			this.session = HibernateUtilForXml.getSessionFactory().getCurrentSession();
		}
		return this.session;
	}

	/**
	 * @param session
	 *            the session to set
	 */
	public final void setSession(final Session session) {
		this.session = session;
	}

	/**
	 * @return the entityClass
	 */
	public final Class<EntityType> getEntityClass() {
		return entityClass;
	}

	/**
	 * @return the idClass
	 */
	public final Class<EntityIdType> getIdClass() {
		return idClass;
	}

	public AbstractDao() {
		
		Type[] parameterizedType = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments();
		if (parameterizedType != null && parameterizedType.length == 2) {
			this.entityClass = (Class<EntityType>) parameterizedType[0];
			this.idClass = (Class<EntityIdType>) parameterizedType[1];
			System.out.println(MessageFormat.format("Class Type:{0},ClassIdType:{1}",
					this.entityClass.getCanonicalName(), this.idClass.getCanonicalName()));
		}
	}

	@Override
	public EntityType findById(EntityIdType id) {
		return (EntityType) getSession().load(this.getEntityClass(), (Serializable) id);
	}

	@Override
	public List<EntityType> findAll() {
		return this.findByCriteria();
	}

	/**
	 * 
	 * @param criterions
	 * @return
	 */
	protected List<EntityType> findByCriteria(Criterion... criterions) {
		Criteria criteria = this.getSession().createCriteria(this.getEntityClass());
		for (final Criterion criterion : criterions) {
			criteria.add(criterion);
		}
		return (List<EntityType>) criteria.list();

	}

	@Override
	public EntityType save(EntityType entity) {
		this.getSession().saveOrUpdate(entity);
		return entity;

	}

	@Override
	public void delete(EntityType entity) {
		this.getSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getSession().flush();
	}

	@Override
	public void clear() {
		this.getSession().clear();
	}
}