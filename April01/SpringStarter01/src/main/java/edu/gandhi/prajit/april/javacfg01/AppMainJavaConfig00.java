package edu.gandhi.prajit.april.javacfg01;

import java.text.MessageFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.gandhi.prajit.april.data.model.User00;
import edu.gandhi.prajit.april.javacfg.service.UserService;

public class AppMainJavaConfig00 {

	public static void main(String[] args) throws Exception {
		final ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig01.class);

		applicationContext.getBean("UserServiceBeanConstructor", UserService.class).getListOfUser()
				.forEach((User00 userTmp) -> {
					System.out.println(MessageFormat.format("User:{0}",userTmp));
				});
		applicationContext.getBean("UserServiceBeanSetter", UserService.class).getListOfUser()
				.forEach((User00 userTmp) -> {
					System.out.println(MessageFormat.format("User:{0}",userTmp));
				});

		((AnnotationConfigApplicationContext) applicationContext).close();
	}

}
