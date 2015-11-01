package spring.core.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDiTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("DiContext.xml");
		HelloLanguage helloLanguage = (HelloLanguage)context.getBean("helloLanguage");
		helloLanguage.helloJava();
		helloLanguage.helloC();

	}

}
