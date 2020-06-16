package code;

public class PeakIndexinMtnArray {
	public int peakIndexInMountainArray(int[] A) {
		
		for(int i = 0; i < A.length-1; i++) {
			if(A[i] < A[i+1]) continue;
			return i;
		}
		
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,2,1,0};
		PeakIndexinMtnArray pi = new PeakIndexinMtnArray();
		System.out.println(pi.peakIndexInMountainArray(arr));
	}

}
