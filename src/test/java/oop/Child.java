package oop;

public class Child extends Parent {
	int speedlimit = 180;
	
	@Override
	public void run() {
		
		System.out.println("Run faster!!");
	}
	
	private void swim() {
		System.out.println("swim faster!!");
	}
	
	public static void main(String[] args){
		Parent parent = new Child();
		parent.run();
		System.out.println(parent.speedlimit);
		
		Child c = new Child();
		c.swim();
	}

}
