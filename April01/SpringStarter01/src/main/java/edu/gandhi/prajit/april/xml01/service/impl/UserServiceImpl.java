package edu.gandhi.prajit.april.xml01.service.impl;

import java.text.MessageFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.gandhi.prajit.april.data.model.User00;
import edu.gandhi.prajit.april.xml01.repo.UserRepository;
import edu.gandhi.prajit.april.xml01.service.UserService;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
	@Autowired
	/**Provided At Field,Member,Setter Level*/
	private UserRepository userRepository;
	private static Integer OrderInvocation=0;

	static{
		System.out.println(MessageFormat.format("Static Block Called When:{0}",OrderInvocation++));
	}
	public UserServiceImpl() {
		System.out.println(MessageFormat.format("NoArg Constructor Block Called When:{0}",OrderInvocation++));
	}

	/**
	 * @param userRepository
	 */
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
		System.out.println(MessageFormat.format("Arg Constructor Block Called When:{0}",OrderInvocation++));
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
	@Autowired
	public final void setUserRepository(UserRepository userRepository) {
		System.out.println(MessageFormat.format("Setter Block Called When:{0}",OrderInvocation++));
		this.userRepository = userRepository;
	}
}