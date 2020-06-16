package code;
import java.util.HashMap;
import java.util.Map;

public class UniqueMorseCodeWords {
	
	private Map<Character, String> morseCodes;
	
	public UniqueMorseCodeWords() {
		
		//easier if I stored codes in an array and indexed each character with (char - 'a')
		 morseCodes = new HashMap<Character, String>();
		 morseCodes.put('a', ".-");
		 morseCodes.put('b', "-...");
		 morseCodes.put('c', "-.-.");
		 morseCodes.put('d', "-..");
		 morseCodes.put('e', ".");
		 morseCodes.put('f', "..-.");
		 morseCodes.put('g', "--.");
		 morseCodes.put('h', "....");
		 morseCodes.put('i', "..");
		 morseCodes.put('j', ".---");
		 morseCodes.put('k', "-.-");
		 morseCodes.put('l', ".-..");
		 morseCodes.put('m', "--");
		 morseCodes.put('n', "-.");
		 morseCodes.put('o', "---");
		 morseCodes.put('p', ".--.");
		 morseCodes.put('q', "--.-");
		 morseCodes.put('r', ".-.");
		 morseCodes.put('s', "...");
		 morseCodes.put('t', "-");
		 morseCodes.put('u', "..-");
		 morseCodes.put('v', "...-");
		 morseCodes.put('w', ".--");
		 morseCodes.put('x', "-..-");
		 morseCodes.put('y', "-.--");
		 morseCodes.put('z', "--..");
	}
	
	
	 public int uniqueMorseRepresentations(String[] words) {
		 
		 
		 Map<String, String> foundChars = new HashMap<String, String>();
		 
		 for(String word : words) {
			 
			// if(!foundChars.containsKey(this.computeMorseCode(word))) {
				 //foundChars.put(this.computeMorseCode(word), word);
			 //}
			 
			 foundChars.putIfAbsent(this.computeMorseCode(word), word);
		 }
		 
		 
		 return foundChars.size();
		 
		 
	        
	 }
	 
	 public String computeMorseCode(String word) {
		 StringBuilder sb = new StringBuilder();
		 for(char a : word.toCharArray()) {
			 sb.append(this.morseCodes.get(a));
		 }
		 
		 return sb.toString();
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		UniqueMorseCodeWords um = new UniqueMorseCodeWords();
		
		System.out.println(um.uniqueMorseRepresentations(new String[] {"gin", "zen", "gig", "msg"}));

	}

}
