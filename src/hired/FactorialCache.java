package hired;


import java.util.HashMap;

class FactorialCache {
	private static HashMap<Integer, Integer> cache;
    private static Integer calculationsPerformed;

    static {
        cache = new HashMap<Integer, Integer>();
        calculationsPerformed = 0;
    }
    
    public static long[][] solution(long[] numbersToCalculate) {
        long[][] results = new long[numbersToCalculate.length][2];
        for (int i = 0; i < numbersToCalculate.length; i++) {
			System.out.println("calculating " + (int)numbersToCalculate[i]);
            Integer result = factorial((int)numbersToCalculate[i]);
            results[i][0] = result.longValue();
            results[i][1] = calculationsPerformed.longValue();
            calculationsPerformed = 0;
        }

        cache = new HashMap<Integer, Integer>();
        return results;
    }

    private static Integer factorial(Integer value) {
      
    	Integer cached = cache.get(value);
    	if(cached != null) {
    		return cached;
    	} else if(value <= 1) {
    		cache.put(value, 1);
    		return value;
    	} else {
    		Integer result = value * factorial(value-1);
    		calculationsPerformed++;
    		cache.put(value, result);
    		return result;
    	}
    }
    
    public static void main(String[] args) {
    	long[] l = new long[]{2, 4, 7};
    	long[][] solution = solution(l);
    	for(int i = 0; i < solution.length; i++) {
    		System.out.print(solution[i][0] + " " + solution[i][1] + " ");
    	}
    	
    	
    }
}
