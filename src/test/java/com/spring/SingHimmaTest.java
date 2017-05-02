package com.spring;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SingHimmaTest extends TestCase {

	ApplicationContext applicationContext;
	
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("Spring-SingHimma.xml");
	}
	
	@Test
	public void testXia(){
		People xiaoXia = (People) applicationContext.getBean("xiaoXia");
		xiaoXia.doWorking();
	}
	
}
