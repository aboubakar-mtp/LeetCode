package code;

import java.util.regex.*;

public class EvenDigits {
	
	public int countNumbersWithEvenDigits(int[] nums) {
		int count = 0;
		for(int i=0; i < nums.length; i++) {
			if((Integer.toString(nums[i]).length() % 2 == 0)) {
				count++;
			}
		}
			
		return count;
	}
	
	public String defangeIPAddress(String address) {
		
		if(!(Pattern.matches("(((1?\\d?\\d)|(2[0-4]\\d)|(25[0-5]))[.]){3}((1?\\d?\\d)|(2[0-4]\\d)|(25[0-5]))", 
				address))) {
			return "invalide IP: " + address; 
		}
		
		return address.replace(".", "[.]");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EvenDigits ed = new EvenDigits();
		
		System.out.println(ed.countNumbersWithEvenDigits(new int[]{12,345,2,6,7896,698235}));
		
		System.out.println(ed.defangeIPAddress("239.0.252.0"));
		
		System.out.println(Math.pow(2, 30));
	}

}
