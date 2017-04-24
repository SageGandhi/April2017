package edu.gandhi.prajit.april.aw.javacfg01;

import java.text.MessageFormat;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.gandhi.prajit.april.aw.javacfg.repo.UserRepository;
import edu.gandhi.prajit.april.aw.javacfg.service.UserService;
import edu.gandhi.prajit.april.data.model.User00;

public class AppMainJavaConfig01 {
	public static void main(String[] args) throws Exception {
		final ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				edu.gandhi.prajit.april.aw.javacfg01.AutowiredAppConfig01.class);

		String serviceBeanName = null;
		System.out.println(applicationContext.getBeansOfType(UserService.class));
		System.out.println(applicationContext.getBeansOfType(UserRepository.class));
		for (Entry<String, UserService> userTmp : applicationContext.getBeansOfType(UserService.class).entrySet()) {
			userTmp.getValue().getListOfUser().forEach((User00 user) -> {
				System.out.println(user);
			});
			System.out.println(MessageFormat.format("Name:{0}", userTmp.getKey()));
			serviceBeanName = userTmp.getKey();
		}
		System.out.println(applicationContext.getBean(serviceBeanName) == applicationContext.getBean(serviceBeanName)
				? "Singleton In Spring Container" : "Singleton For Show");
		((AnnotationConfigApplicationContext) applicationContext).close();
	}
}