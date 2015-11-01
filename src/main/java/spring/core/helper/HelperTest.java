package spring.core.helper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelperTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext contenContext = new ClassPathXmlApplicationContext("CoreTestContext.xml");

		OutputHelper helperTest = (OutputHelper)contenContext.getBean("outputHelper");
		helperTest.output();

	}

}
