package pattern.creational.factoryMethod;

public class ConcreateFactoryOne extends Factory {

	public Product createProduct() {
		return new ConcreateProductOne();
	}

	
}
