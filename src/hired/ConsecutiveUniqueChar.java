package hired;

public class ConsecutiveUniqueChar {
	//given a string of an arbitrary length, return the biggest unique substring contained inside the word;
	public static String substring(String word) {
		String result = "";
		for(int i = 0; i < word.length(); i++) {
		    String s = "";
		    System.out.println("eval: "+   word.substring(i));
		    char[] arr = word.substring(i).toCharArray();
		    int range=0;
		    boolean complete = false;
		    while(!complete) {
		    	if(!s.endsWith(String.valueOf(arr[range]))) {
		    		s+=arr[range];
		    		range++;
		    	} else {
		    		complete = true;
		    	}
		    	if(range == arr.length) {
		    		complete = true;
		    	}
		    }
		    if(s.length() > result.length()) {
		    	result = s;
		    }
		  
		}
		return result;
	}
	
	public static void main(String[] args) {
		String input = "ashhdioahsifhaivhiapsfjo[asjvalmvkasnfhawirhaofm[lafawhffanlcma[nfafaiwpfnpawnfawnfa";
		System.out.println(substring(input));
	}
}
