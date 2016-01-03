package pattern.observer;

import org.junit.Before;
import org.junit.Test;

import pattern.behavioral.chainOfRespons.ConcreteHandlerOne;
import pattern.behavioral.chainOfRespons.Handler;
import pattern.behavioral.chainOfRespons.Request;

public class ChainOfResponsibilityTest {
	Handler handler1;
	Handler handler2;
	Handler handler3;
	
	@Before
	public void before(){
		
		handler1 = new ConcreteHandlerOne();
		handler2 = new ConcreteHandlerOne();
		handler1.setHandler(handler2);
	}
	
	@Test
	public void chainOfResponsibilityTest(){
		Request request = new Request(1);
		handler1.handleRequest(request);
	}
	

}
