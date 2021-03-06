package com.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingHimmaTest {

	ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext(
				"Spring-SingHimma.xml");
	}

	@Test
	public void testxiaoXia() {
		People xiaoXia = (People) applicationContext.getBean("xiaoXia");
		xiaoXia.doWorking();
	}

	@Test
	public void testxiaoZhi() {
		// xiaoXia默认作用域为singleton
		SingHimma xiaoXia = (SingHimma) applicationContext.getBean("xiaoXia");
		xiaoXia.doWorking();

		// 给xiaoXia一首新歌
		xiaoXia.setSong(new SugerSong());

		// 重新从Spring容器中取得xiaoXia,发现song变成了SugerSong
		SingHimma xiaoXia2 = (SingHimma) applicationContext.getBean("xiaoXia");
		xiaoXia2.doWorking();

		// xiaoZhi作用域为prototype
		SingHimma xiaoZhi = (SingHimma) applicationContext.getBean("xiaoZhi");
		xiaoZhi.doWorking();

		// 给xiaoZhi一首新歌
		xiaoZhi.setSong(new SugerSong());

		// 重新从Spring容器中取得xiaoZhi,发现song没有变化
		SingHimma xiaoZhi2 = (SingHimma) applicationContext.getBean("xiaoZhi");
		xiaoZhi2.doWorking();
	}

	@Test
	public void testxiaoMei() {
		People xiaoMei = (People) applicationContext.getBean("xiaoMei");
		xiaoMei.doWorking();
	}

	@After
	public void destroy() {
		// 关闭容器，演示destory-method
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}
