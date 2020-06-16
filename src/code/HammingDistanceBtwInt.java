package code;

public class HammingDistanceBtwInt {
	
	public int hammingDistance(int x, int y) {
        int count = 0;
        int z = x ^ y;
        
        while(z != 0) {
        	if((z & 1) == 1) count++;
        	
        	z = z >> 1;
        }
        
        return count;
    }
	
	public int hammingDistance2(int x, int y) {
       
        
        return Integer.bitCount(x ^ y);
          
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HammingDistanceBtwInt hd = new HammingDistanceBtwInt();
		System.out.println(hd.hammingDistance2(15, 13));
	}

}
