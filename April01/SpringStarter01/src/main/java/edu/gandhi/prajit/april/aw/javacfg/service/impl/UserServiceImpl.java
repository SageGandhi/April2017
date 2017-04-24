package edu.gandhi.prajit.april.aw.javacfg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.gandhi.prajit.april.aw.javacfg.repo.UserRepository;
import edu.gandhi.prajit.april.aw.javacfg.service.UserService;
import edu.gandhi.prajit.april.data.model.User00;

@Service("UserServiceBeanSetter")
public class UserServiceImpl implements UserService {
	@Autowired
	@Qualifier("UserRepositoryBean")
	private UserRepository userRepository;

	/**
	 * 
	 */
	public UserServiceImpl() {
		System.out.println("Instantiated Using No-Argumented Constructor");
	}

	/**
	 * @param userRepository
	 */
	public UserServiceImpl(UserRepository userRepository) {
		System.out.println("Instantiated Using Argumented Constructor");
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
		System.out.println("Instantiated Using Setter");
		this.userRepository = userRepository;
	}
}