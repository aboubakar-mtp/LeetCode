package code;

public class RemoveOutermostParen {
	
	public String removeOuterParentheses(String S) {
        if(S.isEmpty()) return S;
        
        StringBuilder ret =  new StringBuilder();
        int count = 0;
        char[] sb = S.toCharArray();
        for(int i=0; i < S.length(); i++) {
        	
        	if((count != 0 && sb[i] == '(')) {
        		ret.append(sb[i]);
        	}
        	
        	if(sb[i] == '(') {
        		count++;
        	}
        	else if(sb[i]== ')') {
        		count--;
        	}
        	
        	if((count != 0 && sb[i] == ')')) {
        		ret.append(sb[i]);
        	}
        }
        
        return ret.toString();
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveOutermostParen ro = new RemoveOutermostParen();
		
		System.out.println(ro.removeOuterParentheses("(()())(())(()(()))"));
	}

}
