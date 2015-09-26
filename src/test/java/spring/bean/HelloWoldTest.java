package spring.bean;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {  
		"classpath:Beans.xml" 		
})
public class HelloWoldTest {
	
	@Autowired
	IHelloWorld helloWorld;
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		helloWorld.setMessage("Hello World");
		assertEquals("Hello World", helloWorld.getMessage());
		
	}

}
