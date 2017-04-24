package edu.gandhi.prajit.april.javacfg01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.gandhi.prajit.april.javacfg.repo.UserRepository;
import edu.gandhi.prajit.april.javacfg.repo.impl.UserRepositoryImpl;
import edu.gandhi.prajit.april.javacfg.service.UserService;
import edu.gandhi.prajit.april.javacfg.service.impl.UserServiceImpl;

@Configuration
/** Application Context Replaced By @Configuration */
public class AppConfig01 {
	@Bean(name = "UserServiceBeanSetter")
	public UserService getUserServiceBeanSetter() {
		final UserServiceImpl userServiceImpl = new UserServiceImpl();
		userServiceImpl.setUserRepository(getUserRepository());
		return userServiceImpl;
	}

	@Bean(name = "UserServiceBeanConstructor")
	public UserService getUserServiceBeanConstructor() {
		final UserServiceImpl userServiceImpl = new UserServiceImpl(getUserRepository());
		return userServiceImpl;
	}

	@Bean(name = "UserRepositoryBean")
	public UserRepository getUserRepository() {
		return new UserRepositoryImpl();
	}
}