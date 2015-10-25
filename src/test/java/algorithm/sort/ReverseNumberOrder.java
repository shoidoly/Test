package algorithm.sort;

import java.util.Comparator;

public class ReverseNumberOrder implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}

}
