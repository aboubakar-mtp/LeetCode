package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {

	public String destCity(List<List<String>> paths) {
		
		if(paths.isEmpty()) return "";
		
		Set<String> source = new HashSet<>();
		Set<String> dest = new HashSet<>();
		
		for(List<String>path : paths) {
			source.add(path.get(0));
			dest.add(path.get(1));
		}
		
		dest.removeAll(source);
		
		return dest.iterator().next();
		

	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> p1 = new ArrayList<>(Arrays.asList("B","C"));
		List<String> p2 = new ArrayList<>(Arrays.asList("D","B"));
		List<String> p3 = new ArrayList<>(Arrays.asList("C","F"));
		List<List<String>> paths = new ArrayList<>();
		paths.add(p1);
		paths.add(p2);
		paths.add(p3);
		
		DestinationCity dc = new DestinationCity();
		
		System.out.println(dc.destCity(paths));

	}

}
