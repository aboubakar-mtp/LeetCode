package code;
import java.lang.reflect.Array;

public class MinTimeVisitPts {
	
	
	public int minTimeToVisitAllPoints(int[][] points) {
		int totalTime = 0;
		
		int numPts = Array.getLength(points[1]);
		
		for(int i = 0; i < numPts -1; i++) {
			
			totalTime += calTime(points[0][i],points[1][i],
					points[0][i+1],points[1][i+1]);
			
			
		}
		
		return totalTime;
        
    }
	
	public int calTime(int x1, int y1, int x2, int y2) {
		int xdiff = Math.abs(x1-x2);
		int ydiff = Math.abs(y1 - y2);
		
		if (xdiff > ydiff) {
			return xdiff;
		}
		
		return ydiff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] points = new int[2][3];
		
		points[0][0] = 1;
		points[1][0] = 1;
		points[0][1] = 3;
		points[1][1] = 4;
		points[0][2] = -1;
		points[1][2] = 0;
		
		MinTimeVisitPts mt = new MinTimeVisitPts();
		
		System.out.println();

	}

}
