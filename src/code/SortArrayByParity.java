package code;

public class SortArrayByParity {
	
	 public int[] sortArrayByParity(int[] A) {
	   int[] B = new int[A.length];
	   
	   int l = 0;
	   int r = A.length -1;
	   for(int i : A) {
		   if(i % 2 == 0) {
			   B[l++] = i;
			   
		   }
		   else {
			   B[r--] = i;
		   }
	   }
	   
	   return B;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortArrayByParity sa = new SortArrayByParity();
		int[] B = sa.sortArrayByParity(new int[] {3,1,2,4});
		
		for(int a : B) {
			System.out.print(a+ " ");
		}

	}

}
