package code;

public class FlippingImage {

	public int[][] flipAndInvertImage(int[][] A) {
		//int[][] B = new int[A.length][A[0].length];
		int j = 0;
		for(int i = 0; i < A.length; i++) {
			for(j=0; j < A[0].length/2; j++) {
				int a = 1  - A[i][j];
				A[i][j] = 1 - A[i][A[0].length - 1 - j];
				A[i][A[0].length - 1 - j] = a;
				
			}
			
			if((A[0].length) % 2 != 0) {
				A[i][j] = 1 - A[i][j];
			}
		}
        
		return A;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FlippingImage fi = new FlippingImage();
		
		int[][] C = new int[][] {
			{1,1,0},
			{1,0,1},
			{0,0,0}	
		};
		int[][] A = fi.flipAndInvertImage(C);
		
		for(int i = 0; i < A.length; i++ ) {
			for(int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
