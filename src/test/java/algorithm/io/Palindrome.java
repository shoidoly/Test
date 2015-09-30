package algorithm.io;

import java.util.Scanner;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		String reverse = "";
		for (int i = word.length()-1; i>=0; i--){
			reverse += word.charAt(i);
		}
		if (word.equals(reverse)){
			System.out.println("This is palindrome.");
		} else {
			System.out.println("This is not palindrome.");
		}

	}

}
