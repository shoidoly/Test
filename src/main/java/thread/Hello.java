package thread;

public class Hello extends Thread {
	
	@Override
	public void run(){
		System.out.println("Hello!!");
	}
	
	public static void main(String[] args){
		Hello hello = new Hello();
		hello.start();
	}
}
