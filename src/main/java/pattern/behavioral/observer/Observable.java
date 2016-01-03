package pattern.behavioral.observer;

import java.util.Iterator;
import java.util.Vector;

public abstract class Observable {

	Vector<Observer> observerList;
	
	public void addObserver(Observer observer){
		if (observer == null){
			observerList = new Vector<Observer>();
		}
		
		observerList.add(observer);
	}
	
	public void notifyObservers(){
		Iterator<Observer> itr = observerList.iterator();
		while(itr.hasNext()){
			Observer observer = itr.next();
			observer.update(this);
		}
	}
	
	public abstract void excute();
}
