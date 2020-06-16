package code;

import java.util.HashMap;
import java.util.Map;

public class HTMLEntityParser1410 {
	
	 public String entityParser(String text) {
		 
		 if(text == null) return null;
		 Map<String, String> map = new HashMap<>();
		 
		 map.put("&quot;", "\"");
		 map.put("&apos;", "'");
		 map.put("&amp;", "&");
		 map.put("&gt;", ">");
		 map.put("&lt;", "<");
		 map.put("&frasl;", "/");
		 
		 StringBuilder ret = new StringBuilder();
		 
		 
		 for(int i = 0; i < text.length(); i++) {
			 if(text.charAt(i) == '&') {
				 for(int j=i; j < text.length(); j++) {
					 if(text.charAt(j) == ';') {
						 
						 String str = text.substring(i, j+1);
						 
						 if(map.containsKey(str)) {
							 ret.append(map.get(str));
						 }
						 else {
							 ret.append(str);
						 }
						 i = j;
						 break;
					 }
				 }
			 }
			 else {
				 ret.append(text.charAt(i));
			 }
		 }
		 
		 
		 return ret.toString();
	        
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HTMLEntityParser1410 ht = new HTMLEntityParser1410();
		String text = "leetcode.com&frasl;problemset&frasl;all";
		
		System.out.println(ht.entityParser(text));

	}

}
