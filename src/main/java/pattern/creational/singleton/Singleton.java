package pattern.creational.singleton;

public class Singleton {
	
	private static Singleton singleton;
	private int i=0;
	
	private Singleton(){
		
	}
	
	public static synchronized Singleton getInstance(){
		
		if (singleton == null){
			singleton = new Singleton();
		} 
		
		return singleton;
	}
	
	public static Singleton getInstanceDoublelock(){
		
		if (singleton == null){
			synchronized(Singleton.class){
				if (singleton == null){
					singleton = new Singleton();
				}
			}
		}
		
		return singleton;
	}
	
	public int incrementValue() {
		i++;
		return i;
	}

}
