package spring.core.di;

public class HelloLanguage {
	
	private HelloJava helloJava;
	private HelloC helloC;
	
	public void setHello(HelloJava helloJava, HelloC helloC){
		this.helloJava = helloJava;
		this.helloC = helloC;
	}
	
	public void setHelloJava(HelloJava helloJava){
		this.helloJava = helloJava;
	}
	
	public void setHelloC(HelloC helloC){
		this.helloC = helloC;
	}
	
	public void helloJava(){
		helloJava.Hello();
	}
	
	public void helloC(){
		helloC.Hello();
	}

}
