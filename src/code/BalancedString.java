package code;

public class BalancedString {
	
	public int balanceStringsSplit(String s) {
		int count = 0;
		int track = 0;
		
		if(s.length() % 2 != 0) {
			return 0;
		}
		
		for (int i= 0; i < s.length(); i++) {
			if(s.charAt(i) == 'R') {
				track++;
			}
			else if(s.charAt(i) == 'L') {
				track--;
			}
			
			if(track == 0) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BalancedString bs = new BalancedString();
		
		System.out.println(bs.balanceStringsSplit("RLRRRLLRLL"));

	}

}
