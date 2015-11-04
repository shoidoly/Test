package pattern.creational.observer;

public class CurrentStatus implements Observer {

	public void update(float temp, float altitude) {
		System.out.println("temperature : "+temp);
		System.out.println("altitude : "+altitude);
	}

}
