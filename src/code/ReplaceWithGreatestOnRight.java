package code;

public class ReplaceWithGreatestOnRight {
	
	public int[] replaceElements(int[] arr) {
		
		if(arr.length == 1) {
			arr[0] = -1;
			return arr;
		}
        int i = 0;
        int max = -1;
		for( i = 0; i < arr.length -1; i++) {
			
			if(max == arr[i] || max == -1) { // only update max when it differs from current element
				max = arr[i+1];
			
				for(int j= i+2; j < arr.length; j++) {
					if(arr[j] > max) max = arr[j];
				}
			}
			arr[i] = max;
		}
		
		arr[i] = -1;
		
		return arr;
    }
	
	public int[] replaceElements2(int[] arr) {
		int len = arr.length;
		int max = arr[len - 1];
		
		for(int i = len - 2; i>=0; i--) {
			int v = arr[i];
			
			arr[i] = max;
			
			if(v > max) max = v;
		}
		
		arr[len - 1] = -1;
		return arr;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceWithGreatestOnRight rw = new ReplaceWithGreatestOnRight();
		
		int[] arr = new int[] {56903,18666,60499,57517,26961};
		
		for (int i : rw.replaceElements2(arr) )
		System.out.print(i + " ");
	}

}
