package code;
import java.util.Arrays;

public class SquaresOfSortedArray {
	
	 public int[] sortedSquares(int[] A) {
		 
		 for(int i = 0; i < A.length; i++) {
			 A[i] *= A[i];
		 }
		 
		 Arrays.sort(A);
		 return A;
				   
	 }
	 public int[] sortedSquares2(int[] A) {
		 
		 int[] res = new int[A.length];
		 int start = 0, end = A.length - 1;
		 int index = end;
		 while(start <= end) {
			 int p1 = A[start] * A[start];
			 int p2 = A[end] * A[end];
			  if(p1 > p2) {
				  res[index--] = p1;
				  start++;
			  }
			  else {
				  res[index--] = p2;
				  end--;
			  }
		 }
		 
		 return res;
				   
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquaresOfSortedArray so = new SquaresOfSortedArray();
		int[] ab = {-4,-1,0,3,10};
		System.out.println(Arrays.toString(so.sortedSquares2(ab)));
	}

}
