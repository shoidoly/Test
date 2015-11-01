package algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Evaluate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		double tot = 0.0;
		while(in.hasNext()){
			String s = in.next();
			if (s.equals("(")){
				
			} else if (s.equals("+")){
				ops.push(s);
			} else if (s.equals("-")){
				ops.push(s);
			} else if (s.equals(")")){
				String prevOps = ops.pop();
				double v = vals.pop();
				if (prevOps.equals("+")) {
					v = vals.pop() + v; 
				} else if (prevOps.equals("-")){
					v = vals.pop() - v;
				}
				vals.push(v);
			} else {
				vals.push(Double.valueOf(s));
			}
		}
		
		System.out.println("total : "+vals.pop());

	}

}
