package com.jpm;

public class MaxProfit {
	
	private static String[] dailyProfit = {"10", "9", "-5", "-4", "5", "5", "-5", "-5", "6", "-3", "2"};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int tot = 0;
		int maxTot = 0;
		for (int i=0; i<dailyProfit.length; i++){ // windows count
			for (int j=i; j<dailyProfit.length; j++){	// starting point
				tot = 0;
				for (int k=j; k<dailyProfit.length-i; k++){	// end point
					System.out.print(Integer.valueOf(dailyProfit[k]));
					tot += Integer.valueOf(dailyProfit[k]);
				}
				System.out.println("tot : "+ tot);
				if (maxTot < tot) maxTot = tot;
			}
		}
		System.out.println(maxTot);
	}

}
