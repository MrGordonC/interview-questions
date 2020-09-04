package ArraysAndStrings;

import java.util.HashSet;

public class PalindromePermutation {

	public static boolean palindromePermutation(String s) {
		 HashSet<Character> hM= new HashSet<Character>();
		 char[] array = s.toLowerCase().toCharArray();
		 for(int i = 0; i < array.length; i++) {
			 if(hM.contains(array[i])) {
				 hM.remove(array[i]);
			 } else {
				 hM.add(array[i]);
			 }
		 }
		 hM.remove(' ');
		 hM.toArray();
		 System.out.println(hM.size());
		 System.out.println(hM.toString());
		 if(hM.size() > 1) {
			 return false;
		 } else { 
			 return true;
		 }
		 
	}
	
	public static void main(String[]args) {
		System.out.println(palindromePermutation("aallppddekekkd"));
	}

}
