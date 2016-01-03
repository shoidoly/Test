package pattern.observer;

import org.junit.Test;

import pattern.creational.singleton.Singleton;

public class SingletonTest {
	
	@Test
	public void testSingleton(){
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.incrementValue());
		System.out.println(singleton.incrementValue());
	}

}
