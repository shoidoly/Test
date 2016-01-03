package pattern.behavioral.observer;

import java.util.Random;

public class ConcreteObservableOne extends Observable {
	Random random = new Random();
	int value = 0;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public void excute() {
		this.value = random.nextInt(50);
		notifyObservers();
		
	}


	
}
