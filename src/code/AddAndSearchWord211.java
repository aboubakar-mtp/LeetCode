package code;

import java.util.HashMap;
import java.util.Map;

public class AddAndSearchWord211 {
	
	public class TrieNode{
		Map<Character, TrieNode> children;
		boolean end;
		
		public TrieNode() {
			children = new HashMap<>();
			end = false;
		}
	}
	
	TrieNode root;
	public AddAndSearchWord211() {
		root = new TrieNode();
	}
	
	public void addWord(String word) {
		addWord(root, word, 0);
	}
	
	public void addWord(TrieNode current, String word, int index) {
		if(index == word.length()) {
			current.end = true;
			return;
		}
		
		char ch = word.charAt(index);
		TrieNode tn = current.children.get(ch);
		if(tn == null) {
			tn = new TrieNode();
			current.children.put(ch, tn);
		}
		addWord(tn, word, index + 1);
	}
	
	public boolean search(String word) {
		return search(root, word, 0);
	}
	
	public boolean search(TrieNode current, String word, int index) {
		if(index == word.length()) {
			return current.end;
		}
		char ch = word.charAt(index);
		
		if(ch == '.') {
			for(TrieNode node : current.children.values()) {
				boolean s = search(node, word, index + 1);
				if(s) {
					return true;
				}
			}
			
			return false;
		}
		
		TrieNode tn = current.children.get(ch);
		if(tn == null) {
			return false;
		}
		return search(tn, word, index + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AddAndSearchWord211 as = new AddAndSearchWord211();
		
		as.addWord("bad");
		as.addWord("dad");
		as.addWord("mad");
		
		System.out.println(as.search("pad"));
		
		System.out.println(as.search("bad"));
		System.out.println(as.search(".ad"));
		System.out.println(as.search("b.."));

	}

}
