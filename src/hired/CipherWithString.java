package hired;

import java.util.HashMap;

public class CipherWithString {
	
	//given some cipher, encrypt a String using it mapping word[i] to cipher[i]
	
	public static String encrypt(String word, String cipher) {
		String encriptedString = "";
		HashMap<Character, Character> cipherMap = new HashMap<Character, Character>(); 
		char[] aB = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		System.out.println(String.valueOf(aB));
		char[] cArr = cipher.toCharArray();
		System.out.println(String.valueOf(cArr));
		for(int i = 0; i < cArr.length && i <= aB.length-1; i++) {
			cipherMap.put(aB[i], cArr[i]);
			System.out.println(aB[i] + " mapped to " + cArr[i]);
		}
		char[] wordArr = word.toCharArray();
		for(int k = 0; k < wordArr.length; k++) {
			Character e = cipherMap.get(wordArr[k]);
			if(e != null) {
				wordArr[k] = e;
			}
		}
		encriptedString = String.valueOf(wordArr);
		return encriptedString;
	}
	
	public static void main(String[] args) {
		String word = "hello my name is gordon chan and I have written this program";
		String cipher = "qwertyuiopasdfghjklzxcvbnm";
		System.out.println(encrypt(word, cipher));
	}

}
