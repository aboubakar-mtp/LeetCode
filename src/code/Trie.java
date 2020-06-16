package code;

import java.util.HashMap;
import java.util.Map;

public class Trie {
	
	private class TrieNode{
		Map<Character, TrieNode> children;
		boolean end;
		
		public TrieNode() {
			children = new HashMap<Character, Trie.TrieNode>();
			end = false;
		}
	}
	
	private TrieNode root;
	 /** Initialize your data structure here. */
    public Trie() {
    	
    	root = new TrieNode();
        
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
    	TrieNode current = root;
    	for(int i = 0; i < word.length(); i++) {
    		char c = word.charAt(i);
    		TrieNode tn = new TrieNode();
    		
    		if(current.children.get(c) == null) {
    			
    			current.children.put(c, tn);
    			current = tn;
    			
    		}
    		else {
    			current = current.children.get(c);
    		}
    	}
    	current.end = true;
        
    }
    //recursive implementation
    public void insert2(String word) {
    	insertRecursive(root, word, 0);
    }
    public void insertRecursive(TrieNode current, String word, int index) {
    	
    	if(index == word.length()) {
    		current.end = true;
    		return;
    	}
    	char ch = word.charAt(index);
    	TrieNode node = current.children.get(ch);
    	if(node == null) {
    		node = new TrieNode();
    		current.children.put(ch, node);
    	}
    	insertRecursive(node, word, index + 1);
    	
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
    	
    	TrieNode current = root;
    	
    	for(int i = 0; i < word.length(); i++) {
    		char c = word.charAt(i);
    		
    		if(current.children.get(c) == null) {
    			return false;
    		}
    		current = current.children.get(c);
    	}
    	
    	return current.end;
        
    }
    
    public boolean search2(String word) {
    	
    	return searchRecursive(root, word, 0);
    }
    
    public boolean searchRecursive(TrieNode current, String word, int index) {
    	if(index == word.length()) {
    		return current.end;
    	}
    	char ch = word.charAt(index);
    	TrieNode node = current.children.get(ch);
    	if(node == null) {
    		return false;
    	}
    	
    	return searchRecursive(node, word, index + 1);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
    	TrieNode current = root;

		for (int i = 0; i < prefix.length(); i++) {
			char c = prefix.charAt(i);

			if (current.children.get(c) == null) {
				return false;
			}
			current = current.children.get(c);
		}

		return true;
        
    }
    
    public boolean startsWith2(String prefix) {
    	
    	return startsWithRecursive(root, prefix, 0);
    }
    public boolean startsWithRecursive(TrieNode current, String word, int index) {
    	if(index == word.length()) {
    		return true;
    	}
    	char ch = word.charAt(index);
    	TrieNode node = current.children.get(ch);
    	if(node == null) {
    		return false;
    	}
    	
    	return startsWithRecursive(node, word, index + 1);
    }
    
    public void delete(String word) {
    	if(search(word)) {
    		delete(root, word, 0);
    	}
    }
    
    public void delete(TrieNode current, String word, int index) {
    	if(index == word.length()) {
    		current.end = false;
    		return;
    	}
    	char ch = word.charAt(index);
    	TrieNode node = current.children.get(ch);
    	
    	delete(node, word, index + 1);
    	if(node.children.isEmpty()) {
    		current.children.remove(ch);
    	}
    }
    
    public void delete2(String word) {
    	delete2(root, word, 0);
    }
    
    private boolean delete2(TrieNode current, String word, int index) {
    	if(index == word.length()) {
    		if(!current.end) {
    			return false;
    		}
    		current.end = false;
    		
    		return current.children.size() == 0;
    	}
    	
    	char ch = word.charAt(index);
    	TrieNode node = current.children.get(ch);
    	if(node == null) {
    		return false;
    	}
    	boolean shouldDelCurrentNode = delete2(node, word, index + 1);
    	
    	if(shouldDelCurrentNode) {
    		current.children.remove(ch);
    		return current.children.size() == 0;
    	}
    	
    	return false;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
    	Trie tr = new Trie();
    	
    	tr.insert("apple");
    	System.out.println(tr.search("apple"));
    	
    	System.out.println(tr.search("app"));
    	System.out.println(tr.startsWith("app"));
    	
    	tr.insert("app");
    	System.out.println(tr.search("app"));
    	
    	tr.delete2("app");
    	System.out.println(tr.search("app"));

	} 
    
}






















