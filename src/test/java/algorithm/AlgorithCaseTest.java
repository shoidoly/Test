package algorithm;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import algorithm.sort.ReverseNumberOrder;

public class AlgorithCaseTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String[] a = {"aa", "bb", "ab"};
		String[] b = {"bb", "ab", "aa"};
		Arrays.sort(a);
		//Arrays.sort(b);
		printStr(a);
		printStr(b);
		assertArrayEquals(a, b);
	}
	
	@Test
	public void testLinkedList() {
		final LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(1);
		numbers.add(2);
		//numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		numbers.add(2, 3);
		
		System.out.println(numbers);
	}

	private void printStr(String[] a) {
		if (a == null) return;
		for (int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		
	}
	
	private void printStr(Object[] a) {
		if (a == null) return;
		for (int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		
	}

}
