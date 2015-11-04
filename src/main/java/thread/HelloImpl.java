package thread;

public class HelloImpl implements Runnable {

	public void run(){
		
		System.out.println("implement thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("implement thread");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloImpl hello = new HelloImpl();
		Thread th1 = new Thread(hello);
		th1.start();
	}

}
