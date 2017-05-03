package com.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HimmaTeamTest {
	ApplicationContext applicationContext;
	
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("Spring-HimmaTeam.xml");
	}
	
	@Test
	public void testXiaoMing(){
		People buleTeam = (People) applicationContext.getBean("blueTeam");
		buleTeam.doWorking();
	}
	@After
	public void destroy() {
		// 关闭容器，演示destory-method
		((ClassPathXmlApplicationContext) applicationContext).close();
	}
}
