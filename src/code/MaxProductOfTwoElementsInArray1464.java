package code;

import java.util.Arrays;

public class MaxProductOfTwoElementsInArray1464 {
	//sort array and compare product of first two and last two elements
	public int maxProduct(int[] nums) {
		
		
		int len = nums.length;
		if(len <= 1) return -1;
		if(len == 2) return (nums[0] - 1) * (nums[1] - 1);
		Arrays.parallelSort(nums);
		
		if(nums[0] < 0) {
			int val1 = (nums[0] -1) * (nums[1] - 1);
			int val2 = (nums[len-1] - 1) * (nums[len-2] - 1);
			
			if(val1 > val2) {
				return val1;
			}else {
				return val2;
			}
		}
		
		return (nums[len-1] - 1) * (nums[len-2] - 1);
		
	}
	
	//brute force method
	
	public int maxProduct2(int[] nums) {
		int len = nums.length;
		
		if(len <= 1) return -1;
		if(len == 2) return (nums[0] - 1) * (nums[1] - 1);
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < len; i++) {
			for(int j = i+1; j <len; j++) {
				if(i == j) continue;
				int val = (nums[i] - 1) * (nums[j] - 1);
				
				if(val > max) {
					max = val;
				}
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaxProductOfTwoElementsInArray1464 mp = new MaxProductOfTwoElementsInArray1464();
		
		int[] arr = new int[] {1,5,4,5};
		
		System.out.println(mp.maxProduct(arr));
		System.out.println(mp.maxProduct2(arr));
	}

}
