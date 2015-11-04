package pattern.creational.observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {
	
	private ArrayList<Observer> observerList;
	private float temp;
	private float altitude;
	
	public ConcreteSubject(){
		observerList = new ArrayList<Observer>();
	}

	public void removeObserver(Observer observer) {
		observerList.remove(observer);
	}

	public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	public void notifyObservers() {
		
		for (Observer obs: observerList){
			obs.update(this.temp, this.altitude);
		}

	}
	
	public void changeStatus(float temp, float altitude){
		this.temp = temp;
		this.altitude = altitude;
		notifyObservers();
	}

	

}
