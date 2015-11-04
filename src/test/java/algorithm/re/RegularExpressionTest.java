package algorithm.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;

public class RegularExpressionTest {
	
	@Before
	public void before(){
		
	}
	
	@Test
	public void findPhoneNumber(){
		String input = "This order was placed for QT3000! OK? call me at 214-875-7389. ";
		String regex = "[\\d\\d\\d.\\d\\d\\d.\\d\\d\\d\\d]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		System.out.println("Input String matches regex : "+matcher.find());
		
		while (matcher.find()) {
			System.out.println(input.substring(matcher.start(), matcher.end()));
		}

		
	}
	
	@Test
	public void testRegular(){
		// using pattern with flags
		Pattern pattern = Pattern.compile("ab", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("ABcabdAb");
		// using Matcher find(), group(), start() and end() methods
		while (matcher.find()) {
			System.out.println("Found the text \'" + matcher.group()
					+ "\' starting at " + matcher.start()
					+ " index and ending at index " + matcher.end());
		}

		// using Pattern split() method
		pattern = Pattern.compile("\\W");
		String[] words = pattern.split("one@two#three:four$five");
		for (String s : words) {
			System.out.println("Split using Pattern.split(): " + s);
		}

		// using Matcher.replaceFirst() and replaceAll() methods
		pattern = Pattern.compile("1*2");
		matcher = pattern.matcher("11234512678");
		System.out.println("Using replaceAll: " + matcher.replaceAll("_"));
		System.out.println("Using replaceFirst: " + matcher.replaceFirst("_"));
	}

}
