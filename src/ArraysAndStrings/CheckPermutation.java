package ArraysAndStrings;

import java.util.Arrays;
import java.util.HashSet;

public class CheckPermutation {
	
	 //repetition allowed
	static boolean isPermutation(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
		char[] mapValues = a.toCharArray();
		Arrays.sort(mapValues);
		
		char[] permutationArr = b.toCharArray();
		Arrays.sort(permutationArr);
		
		for(int i = 0; i < mapValues.length; i++) {
			if(mapValues[i] != permutationArr[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.print(isPermutation("hello", "heoll"));
	}

}
