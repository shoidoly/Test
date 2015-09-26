package pattern.observer;

public interface Subject {
	
	public void removeObserver(Observer Observer);
	public void addObserver(Observer observer);
	public void notifyObservers();

}
