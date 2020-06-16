package code;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	
	Map<Integer, Integer> map = new HashMap<>();
	
	public int fib(int N) {
		
		if ( N == 0) {
			map.put(N, N);
			return 0;
		}
		if (N == 1 ) {
			map.put(N, N);
			return 1;
		}
		
		if(map.containsKey(N)) return map.get(N);
		
		int res = fib(N-1) + fib(N-2);
		map.put(N, res);
		
		return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		Fibonacci f = new Fibonacci();
		
		System.out.println(f.fib(5));

	}

}
