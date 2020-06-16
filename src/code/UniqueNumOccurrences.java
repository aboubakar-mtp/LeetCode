package code;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumOccurrences {
	 public boolean uniqueOccurrences(int[] arr) {
		 HashMap<Integer, Integer> mp = new HashMap<>();
		 
		 for(int i = 0; i < arr.length; i++) {
			 if(mp.containsKey(arr[i])) {
				 mp.put(arr[i], mp.get(arr[i]) + 1);
			 }
			 else {
				 mp.put(arr[i], 1);
			 }
		 }
		
		 ArrayList<Integer> vals = new ArrayList<Integer>(mp.values());
		 
		 for(int i = 0; i < vals.size(); i++) {
			 for(int j = i+1; j < vals.size(); j++) {
				 if(vals.get(i) == vals.get(j)) return false;
			 }
		 }
			 
		 
		 return true;
	        
	   }
	 
	 public boolean uniqueOccurrences2(int[] arr) {
		 HashMap<Integer, Integer> mp = new HashMap<>();
		 
		 for(int i = 0; i < arr.length; i++) {
			 if(mp.containsKey(arr[i])) {
				 mp.put(arr[i], mp.get(arr[i]) + 1);
			 }
			 else {
				 mp.put(arr[i], 1);
			 }
		 }
		
		 
		 
		 HashSet<Integer> ss = new HashSet<Integer>(mp.values());
			 
		 
		 return  ss.size() == mp.values().size();
	        
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UniqueNumOccurrences un = new UniqueNumOccurrences();
		int[] arr = {1,2,2,1,1,3};
		
		System.out.println(un.uniqueOccurrences2(arr));
	}

}
