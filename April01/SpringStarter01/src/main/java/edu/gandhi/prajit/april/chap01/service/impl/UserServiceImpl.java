package edu.gandhi.prajit.april.chap01.service.impl;

import java.util.List;

import edu.gandhi.prajit.april.chap01.repo.UserRepository;
import edu.gandhi.prajit.april.chap01.repo.impl.UserRepositoryImpl;
import edu.gandhi.prajit.april.chap01.service.UserService;
import edu.gandhi.prajit.april.data.model.User00;

public class UserServiceImpl implements UserService {
	private static final UserRepository USER_REPOSITORY=new UserRepositoryImpl(); 
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<User00> getListOfUser() throws Exception {
			return USER_REPOSITORY.getListOfUser();
	}
}
