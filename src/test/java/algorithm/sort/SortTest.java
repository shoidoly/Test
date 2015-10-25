package algorithm.sort;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SortTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		final List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);
		final List<Integer> expected = Arrays.asList(7, 6, 5, 4, 4, 3, 1);
		
		Collections.sort(numbers, new ReverseNumberOrder());
		assertEquals(expected, numbers);
	}
	
	@Test
	public void testLinkedList() {
		final LinkedList<Integer> numbers = (LinkedList<Integer>)Arrays.asList(4, 7, 1, 6, 3, 5, 4);
		final List<Integer> expected = Arrays.asList(7, 6, 5, 4, 4, 3, 1);
		
		Collections.sort(numbers, new ReverseNumberOrder());
		assertEquals(expected, numbers);
	}

}
