package edu.gandhi.prajit.april.javacfg.service.impl;

import java.util.List;

import edu.gandhi.prajit.april.data.model.User00;
import edu.gandhi.prajit.april.javacfg.repo.UserRepository;
import edu.gandhi.prajit.april.javacfg.service.UserService;

public class UserServiceImpl implements UserService {
	private UserRepository userRepository;
	
	/**
	 * 
	 */
	public UserServiceImpl() {
	}

	/**
	 * @param userRepository
	 */
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<User00> getListOfUser() throws Exception {
		return userRepository.getListOfUser();
	}

	/**
	 * @param userRepository
	 *            the userRepository to set
	 */
	public final void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
}
