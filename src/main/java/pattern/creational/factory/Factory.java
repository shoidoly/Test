package pattern.creational.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Factory {
	
	public static Product createProduct(String productType){
		
		if (productType.equals("prod1")){
			return new ConcreteProduct();
		} else {
			return new ConcreateProductTwo();
		}
	}
	
	public static Product createProductByName(String name) {
		
		try {
			Class<?> class1 = Class.forName(name);
			Constructor<?> constructor = class1.getConstructor(String.class);
			Product product = (Product)constructor.newInstance(new Object[] {} );
			return product;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	

}
