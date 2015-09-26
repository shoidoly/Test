package algorithm;

import java.util.Arrays;
import java.util.HashMap;

public class AreAnagrams {

	public static boolean areAnagrams(String a, String b) {
//		char[] word1 = a.replaceAll("[\\s]", "").toCharArray();
//        char[] word2 = b.replaceAll("[\\s]", "").toCharArray();
        char[] word1 = a.toCharArray();
        char[] word2 = b.toCharArray();
        System.out.println(word1);
        System.out.println(word2);
        Arrays.sort(word1);
        System.out.println(word1);
        Arrays.sort(word2);
        System.out.println(word2);
        return Arrays.equals(word1, word2);
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("momdad", "dadmom"));
    }

}
