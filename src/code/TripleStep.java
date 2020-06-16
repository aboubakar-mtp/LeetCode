package code;

import java.util.Arrays;

public class TripleStep {
	
	public int countWays(int n) {
		return countWays(n, new int[n + 1]);
	}
	//my implementation used countWays(0) == 1 and thus required additional base cases
	public int countWays(int n, int[] memo) {
		if(n <= 0) return 0;
		if(n == 1) return 1;
		if(n == 2) return 2;
		if(n == 3) return 4;
		
		if(memo[n] == 0) {
			memo[n] = countWays(n-1, memo) + countWays(n-2, memo) + countWays(n-3, memo);
		}
		
		return memo[n];
	}
	
	
	//implementation using countWays(0) = 0, requires less number of base cases
	int countWays2(int n) {
		int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);
		
		return countWays2(n, memo);
	}
	
	public int countWays2(int n, int[] memo) {
		if(n < 0) {
			return 0;
		}
		else if(n == 0) {
			return 1;
		}
		else if(memo[n] > -1) {
			return memo[n];
		}
		else {
			memo[n] = countWays2(n-1, memo) + countWays2(n-2, memo) + countWays2(n-3, memo);
			return memo[n];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TripleStep tp = new TripleStep();
		System.out.println(tp.countWays(30));
		System.out.println(tp.countWays2(30));
	}

}
