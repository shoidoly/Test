package pattern.observer;

import org.junit.Before;
import org.junit.Test;

import pattern.creational.observer.ConcreteSubject;
import pattern.creational.observer.CurrentStatus;
import pattern.creational.observer.FutureStatus;

public class ObserverTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		CurrentStatus currentStatus = new CurrentStatus();
		FutureStatus futureStatus = new FutureStatus();
		ConcreteSubject concreteSubject = new ConcreteSubject();
		concreteSubject.addObserver(currentStatus);
		concreteSubject.addObserver(futureStatus);
		
		concreteSubject.changeStatus(12.21f, 32.23f);
		concreteSubject.changeStatus(45.67f, 78.34f);
	}

}
