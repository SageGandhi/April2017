package edu.gandhi.prajit.april.daopattern.impl;

import java.util.List;

import edu.gandhi.prajit.april.daopattern.AbstractDao;
import edu.gandhi.prajit.april.daopattern.UserDao;
import edu.gandhi.prajit.april.daopattern.entity.User;

public class UserHibernateDao extends AbstractDao<User, Long> implements UserDao {
	@Override
	public List<User> findByFirstName(String firstName) {
		return null;
	}
}