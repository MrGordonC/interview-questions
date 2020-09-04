package ArraysAndStrings;

import java.util.HashSet;

public class UniqueString {
	
	public static boolean unique(String s) {
		char[] arr = s.toCharArray();
		HashSet<Character> hM = new HashSet<Character>();
		for(int i = 0; i < s.length(); i++) {
			if(!hM.contains(Character.valueOf(arr[i]))){
				hM.add(arr[i]);
			} else { 
				return false;
			}
		}
		return true;
	}
	
	public static boolean uniqueASCii(String s) {
		char[] arr = s.toCharArray();
		boolean[] charArr = new boolean[128];
		for(int i = 0; i < arr.length; i++) {
			if(charArr[(int)(arr[i])]) {
				return false;
			} else {
				charArr[(int)(arr[i])] = true;
			}
		}
		
		return true;
	}
	
	public static void printASCII() {
		for(int i = 0; i < 128; i++) {
			System.out.println((char)i+ " has value " + i);
		}
	}
	
	public static void main(String[] args) {
		//System.out.print(unique("helol"));
		System.out.println(uniqueASCii("heol"));
		//printASCII();
	}

}
