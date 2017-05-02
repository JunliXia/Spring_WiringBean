package com.spring;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HimmaTest extends TestCase {

	ApplicationContext applicationContext;
	
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("Spring-Himma.xml");
	}
	
	@Test
	public void testXiaoMing(){
		People xiaoMing = (People) applicationContext.getBean("xiaoMing");
		xiaoMing.doWorking();
	}
	
	@Test
	public void testXiaoHong(){
		People xiaoHong = (People)applicationContext.getBean("xiaoHong");
		xiaoHong.doWorking();
	}
	
	public void testXiaoGang(){
		People xiaoGang = (People)applicationContext.getBean("xiaoGang");
		xiaoGang.doWorking();

	}

}
