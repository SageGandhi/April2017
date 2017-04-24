package edu.gandhi.prajit.april.xml01;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.gandhi.prajit.april.data.model.User00;
import edu.gandhi.prajit.april.xml01.service.UserService;

public class WiringClassesBySpring01 {
	public static void main(String[] args) throws Exception {
		final ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext00.xml");
		
		applicationContext.getBean("UserService00",UserService.class)
			.getListOfUser().forEach((User00 userTmp)->{System.out.println(userTmp);});
		
		applicationContext.getBean("UserService01",UserService.class)
			.getListOfUser().forEach((User00 userTmp)->{System.out.println(userTmp);});
		
		applicationContext.getBean("UserService02",UserService.class)
			.getListOfUser().forEach((User00 userTmp)->{System.out.println(userTmp);});
		
		applicationContext.getBean("UserService03",UserService.class)
			.getListOfUser().forEach((User00 userTmp)->{System.out.println(userTmp);});
		
		((ClassPathXmlApplicationContext)applicationContext).close();
	}
}