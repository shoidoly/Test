package spring.core.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApConfig.class);
		
		HelloWorld helloWorld = (HelloWorld)applicationContext.getBean("helloWorld");
		helloWorld.hello();
		
	}

}
