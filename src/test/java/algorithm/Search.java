package algorithm;

import static org.junit.Assert.*;

import java.util.Hashtable;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Search {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public static boolean binarySearch(final List<Integer> numbers,
			final Integer value) {
		if (numbers == null || numbers.isEmpty()) {
			return false;
		}
		final Integer comparison = numbers.get(numbers.size() / 2);
		if (value.equals(comparison)) {
			return true;
		}
		if (value < comparison) {
			return binarySearch(numbers.subList(0, numbers.size() / 2), value);
		} else {
			return binarySearch(
					numbers.subList(numbers.size() / 2 + 1, numbers.size()),
					value);
		}
	}
	
	class Student {
		private int id;
		private String name;
		
		public Student(int id, String name){
			this.id = id;
			this.name = name;
		}
		
		public void setId(int id){
			this.id = id;
		}
		
		public int getId(){
			return this.id;
		}
		
		public void setName(String name){
			this.name = name;
		}
		
		public String getName(){
			return this.name;
		}
	}
	
	public Hashtable<Integer, Student> setStudent(Student[] students){
		Hashtable<Integer, Student> studentHt = new Hashtable<Integer, Student>();
		for (Student student: students){
			studentHt.put(student.getId(), student);
		}
		
		return studentHt;
	}
	
	@Test
	public void studentTest(){
		Student st1 = new Student(1, "Ryan");
		Student st2 = new Student(2, "Bryan");
		Student st3 = new Student(3, "Colly");
		Student[] st = new Student[3];
		st[0] = st1;
		st[1] = st2;
		st[2] = st3;
		
		Hashtable<Integer, Student> ht = setStudent(st);
		
		for (int i=0; i<ht.size(); i++){
			System.out.println(((Student)ht.get(i+1)).getName());
		}
		
		assertEquals(3, ht.size());
	}
	
	@Test
	public void stringBufferTest(){
		String[] words = {"Bryan", "Ryan", "Henry"};
		System.out.println(getSentence(words));
		assertEquals("BryanRyanHenry", getSentence(words));
	}
	
	private String getSentence(String[] words){
		StringBuffer sb = new StringBuffer();
		for(String word: words){
			sb.append(word);
		}

		return sb.toString();
	}


}
