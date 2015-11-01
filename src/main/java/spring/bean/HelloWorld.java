package spring.bean;

public class HelloWorld 
	//implements IHelloWorld 
	{
	private String message;

	/* (non-Javadoc)
	 * @see spring.bean.IHelloWorld#setMessage(java.lang.String)
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/* (non-Javadoc)
	 * @see spring.bean.IHelloWorld#getMessage()
	 */
	public String getMessage() {
		System.out.println("Your Message : " + message);
		return this.message;
	}
}
