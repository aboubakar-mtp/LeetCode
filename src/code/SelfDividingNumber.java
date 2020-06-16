package code;
import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {


    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> lst = new ArrayList<>();
        
        for(int i = left; i <= right; i++) {
        	if(this.isSelfDividing(i)) {
        		lst.add(i);
        	}
        }
        
        return lst;
    }
    
	public boolean isSelfDividing(int num) {
		if(num % 10 == 0) return false;
		int temp = num;
		while(temp != 0) {
			int a = temp % 10;
			if(a == 0 || ((num % a) != 0)) return false;
			temp = temp/10;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SelfDividingNumber sd = new SelfDividingNumber();
		
		for(int a : sd.selfDividingNumbers(1, 22)) {
			System.out.print(a + ", ");
		}

	}

}
