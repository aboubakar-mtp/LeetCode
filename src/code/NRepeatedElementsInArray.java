package code;
import java.util.HashSet;

public class NRepeatedElementsInArray {
	
	public int repeatedNTimes(int[] A) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i : A) {
			if(hs.contains(i)) {
				return i;
			}
			else {
				hs.add(i);
			}
		}
		
		return -1;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NRepeatedElementsInArray nr = new NRepeatedElementsInArray();
		
		System.out.println(nr.repeatedNTimes(new int[] {2,1,2,5,3,2}));

	}

}
