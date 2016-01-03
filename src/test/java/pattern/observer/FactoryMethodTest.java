package pattern.observer;

import org.junit.Test;

import pattern.creational.factoryMethod.ConcreateFactoryOne;
import pattern.creational.factoryMethod.Factory;
import pattern.creational.factoryMethod.Product;

public class FactoryMethodTest {
	
	@Test
	public void factoryMethodTest(){
		Factory factory = new ConcreateFactoryOne();
		Product product = factory.createProduct();
		product.sayProductName();
	}

}
