package edu.gandhi.prajit.april.xml01;


import java.text.MessageFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReadPropertiesBySpring03 {
	public static void main(String[] args) throws Exception {
		final ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContextProp02.xml");
		System.out.println(MessageFormat.format("Read From Properties File:{0}",applicationContext.getBeansOfType(PropertyHolderInjectionBean00.class)));		
		((ClassPathXmlApplicationContext)applicationContext).close();
	}
}