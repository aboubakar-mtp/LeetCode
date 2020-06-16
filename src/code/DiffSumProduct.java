package code;
import java.util.ArrayList;

public class DiffSumProduct {
	
	
	public int diffSumProd(int n) {
		
		int sum = 0;
		int prod = 1;
		
		while(n !=0 ) {
			int r = n % 10;
			sum += r;
			prod *= r;
			
			n /= 10;
		}
		
		
		
		return prod - sum;
	}
	
	public ArrayList<Integer> decomposeInteger(int quotient){
		ArrayList<Integer> dec = new ArrayList<>();
		
		while(quotient != 0) {
			dec.add(0, (quotient % 10));
			
			quotient /= 10;
			
		}
		
		return dec;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiffSumProduct dsp = new DiffSumProduct();
		
		System.out.println(dsp.diffSumProd(4421));

	}

}
