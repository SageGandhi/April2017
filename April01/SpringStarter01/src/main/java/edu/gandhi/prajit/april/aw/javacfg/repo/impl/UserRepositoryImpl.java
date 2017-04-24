package edu.gandhi.prajit.april.aw.javacfg.repo.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.gandhi.prajit.april.aw.javacfg.repo.UserRepository;
import edu.gandhi.prajit.april.data.model.User00;

@Repository("UserRepositoryBean")
public class UserRepositoryImpl implements UserRepository {
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<User00> getListOfUser() throws Exception {
		final User00 user00 = User00.class.newInstance();
		user00.setEmailId("prajit.ju@gmail.com");
		user00.setFirstName("Prajit");
		user00.setLastName("Gandhi");
		return Arrays.asList(user00);
	}
}
