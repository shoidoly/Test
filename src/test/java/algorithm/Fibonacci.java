package algorithm;

public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] i;
		i = getElement(10);
		for (int j=0; j<i.length; j++){
			System.out.println(i[j]);
		}

	}

	private static int[] getElement(int cnt) {
		int[] elm = new int[cnt]; 
		for (int i=0; i<cnt; i++){
			elm[i] = fib(i);
		}
		return elm;
	}

	private static int fib(int i) {
		if (i<=1) return i;
		else 
		return fib(i-1)+fib(i-2);
	}

}
