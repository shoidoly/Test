package pattern.observer;

import org.junit.Test;

import pattern.creational.factory.Factory;
import pattern.creational.factory.Product;

public class FactoryTest {
	
	@Test
	public void factoryTest(){
		Product product = Factory.createProduct("prod1");
		product.printProduct();
		product = Factory.createProduct("prod2");
		product.printProduct();
		
	}
	

}
