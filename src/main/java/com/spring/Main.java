package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-WiringBean.xml");
		People xiaoming = (People)applicationContext.getBean("xiaoming");
		xiaoming.doWorking();
	}
}
