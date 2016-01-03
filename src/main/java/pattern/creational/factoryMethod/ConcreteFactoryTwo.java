package pattern.creational.factoryMethod;

public class ConcreteFactoryTwo extends Factory {

	public Product createProduct() {
		return new ConcreateProductTwo();
	}

}
