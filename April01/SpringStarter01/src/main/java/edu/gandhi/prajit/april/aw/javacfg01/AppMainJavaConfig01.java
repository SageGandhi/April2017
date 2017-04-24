package edu.gandhi.prajit.april.aw.javacfg01;

import java.text.MessageFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.gandhi.prajit.april.data.model.User00;

public class AppMainJavaConfig01 {
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutowiredAppConfig01.class);

		applicationContext.getBean("UserServiceBeanSetter", edu.gandhi.prajit.april.aw.javacfg.service.UserService.class).getListOfUser()
				.forEach((User00 userTmp) -> {
					System.out.println(MessageFormat.format("User:{0}",userTmp));
				});

		((AnnotationConfigApplicationContext) applicationContext).close();				
	}
}