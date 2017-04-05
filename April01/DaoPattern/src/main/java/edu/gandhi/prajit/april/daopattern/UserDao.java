package edu.gandhi.prajit.april.daopattern;

import java.util.List;

import edu.gandhi.prajit.april.daopattern.entity.User;

public interface UserDao extends GenericDaoInterface<User,Long>{
	/**
	 * 
	 * @param firstName
	 * @return
	 */
	public List<User> findByFirstName(String firstName);
}