package code;

import java.util.Stack;

public class RemoveKDigits402 {
	
	 public String removeKdigits(String num, int k) {
		 
		 if(num == null) return null;
		 Stack<Character> stk = new Stack<>();
		 
		 stk.push(num.charAt(0));
		 for(int i = 1; i < num.length() && k > 0; i++) {
			 char ch = num.charAt(i);
			 if(stk.peek() > ch) {
				 stk.pop();
				 //stk.push(ch);
				 k--;
			 }
			stk.push(ch);
		 }
		 
		 while(k > 0) {
			 stk.pop();
			 k--;
		 }
		 
		 StringBuilder sb = new StringBuilder();
		 while(!stk.isEmpty()) {
			 char ch = stk.pop();
			 if(ch != '0') {
				 sb.insert(0, ch);
			 }
			
		 }
		 return sb.length() > 0 ? sb.toString() : "0";
	        
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveKDigits402 rk = new RemoveKDigits402();
		String num="10200";
		int k = 1;
		System.out.println(rk.removeKdigits(num, k));
	}

}
