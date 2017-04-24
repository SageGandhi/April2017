package edu.gandhi.prajit.april.javacfg01;

import java.text.MessageFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.gandhi.prajit.april.xml01.PropertyHolderInjectionBean00;

public class AppMainJavaConfig01 {
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfigProperty02.class);
		System.out.println(MessageFormat.format("Read From Properties File:{0}",applicationContext.getBeansOfType(PropertyHolderInjectionBean00.class)));
		((AnnotationConfigApplicationContext) applicationContext).close();
	}
}