package code;

public class UniqueIntSumZero {
	
	public int[] sumZero(int n) {
		int[] arr = new int[n];
		
		int half = n /2;
		int index = 0;
		for(int i = 1; i <= half; i++) {
			arr[index++] = i;
			arr[index++] = -i;
			
		}
		if( n % 2 != 0) {
			arr[index] = 0;
		}
		
		return arr;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UniqueIntSumZero ui = new UniqueIntSumZero();
		
		for(int i : ui.sumZero(1)) {
			System.out.print(i + " ");
		}

	}

}
