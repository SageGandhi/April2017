package edu.gandhi.prajit.april.aw.javacfg.repo;

import java.util.List;

import edu.gandhi.prajit.april.data.model.User00;

public interface UserRepository {
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	List<User00> getListOfUser() throws Exception;
}