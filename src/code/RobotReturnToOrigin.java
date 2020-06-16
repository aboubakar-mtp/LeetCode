package code;

public class RobotReturnToOrigin {
	public boolean judgeCircle(String moves) {
		
		if(moves.length() % 2 != 0) return false;
		int countH = 0;
		int countV = 0;
		for(char c : moves.toCharArray()) {
			/* trying to see whether it will be faster with if-else
			switch(c) {
			case 'U': countV++;
				break;
			case 'D': countV--;
				break;
			case 'R': countH++;
				break;
			case 'L': countH--;
				break;
			}*/
			
			if(c == 'U') {
				countV++;
			}
			else if(c == 'D') {
				countV--;
			}
			else if(c == 'R') {
				countH++;
			}
			else if(c == 'L') {
				countH--;
			}
		}
		
		return (countH == 0) && (countV==0);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RobotReturnToOrigin rr = new RobotReturnToOrigin();
		
		System.out.println(rr.judgeCircle("LL"));

	}

}
