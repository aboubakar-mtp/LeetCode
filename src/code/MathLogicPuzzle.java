package code;

public class MathLogicPuzzle {
	
	
	public boolean checkPrime(int n) {
		if(n < 2) return false;
		
		int sqrt = (int) Math.sqrt(n);
		for(int i = 2; i <= sqrt; i++) {
			if(n % i == 0) return false;
		}
		
		return true;
	}
	
	//prints list of primes through through max.
	//sieve of Eratoshthenes
	
	public void printPrimesThroughMax(int max) {
		boolean[] flags = this.sieveOfEratosthenes(max);
		
		for(int i = 0; i < flags.length; i++) {
			if(flags[i]) System.out.print(i + " ");
		}
	}
	
	boolean[] sieveOfEratosthenes(int max) {
		boolean[] flags = new boolean[max + 1];
		
		init(flags);
		int prime = 2;
		while(prime <= Math.sqrt(max)) {
			crossOff(flags, prime);
			prime = getNextPrime(flags, prime);
		}
		
		return flags;
	}
	
	public int getNextPrime(boolean[] flags, int prime) {
		int next = prime + 1;
		while(next < flags.length && !flags[next]) {
			next++;
		}
		
		return next;
	}
	public void crossOff(boolean[] flags, int prime) {
		for(int i = prime * prime; i < flags.length; i += prime) {
			flags[i] = false;
		}
	}
	
	public void init(boolean[] flags) {
		for(int i = 2; i < flags.length; i++) {
			flags[i] = true;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathLogicPuzzle mlg = new MathLogicPuzzle();
		
		mlg.printPrimesThroughMax(25);
		

	}

}
