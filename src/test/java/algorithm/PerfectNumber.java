package algorithm;

import java.util.Scanner;

public class PerfectNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int tot=0;
		for (int i=1; i<=num; i++){
			if (num%i == 0){
				tot += i;
			}
		}
		if (tot/2 == num){
			System.out.println("This is a perfect number");
		} else {
			System.out.println("This is not a perfect number");
		}

	}

}
