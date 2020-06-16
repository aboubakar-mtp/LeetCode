package code;
import java.util.Arrays;

public class LargestSumOfPairMin {
	public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i=i+2) {
        	sum += nums[i];
        }
        
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LargestSumOfPairMin  ls = new LargestSumOfPairMin();
		
		int[] arr = new int[] {1,4,3,2};
		System.out.println(ls.arrayPairSum(arr));
	}

}
