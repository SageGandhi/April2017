package edu.gandhi.prajit.april.aw.javacfg01;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.gandhi.prajit.april.aw.javacfg.repo.UserRepository;
import edu.gandhi.prajit.april.aw.javacfg.service.UserService;
import edu.gandhi.prajit.april.data.model.User00;

public class AppMainJavaConfig02 {
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(edu.gandhi.prajit.april.aw.javacfg01.AutowiredAppConfig01.class);
		
		System.out.println(applicationContext.getBeansOfType(UserService.class));
		System.out.println(applicationContext.getBeansOfType(UserRepository.class));
		for(Entry<String,UserService> userTmp:applicationContext.getBeansOfType(UserService.class).entrySet()){
			userTmp.getValue().getListOfUser().forEach((User00 user)->{System.out.println(user);});
		}
		
		((AnnotationConfigApplicationContext) applicationContext).close();				
	}
}