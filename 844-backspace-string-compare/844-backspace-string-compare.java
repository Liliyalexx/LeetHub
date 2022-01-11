class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        Stack<Character> s1=  backSpace(S);
        
        Stack<Character> s2=  backSpace(T);
        
        if(s1.equals(s2)){
            return true;
        }else{
            return false;
        }
        
    }
    
    public static Stack<Character> backSpace(String p) {
		Stack<Character> stack = new Stack();
    
		char c[]= p.toCharArray();
		for(int i=0;i < c.length;i++) {
			if(c[i] != '#') {
			stack.push(c[i]);
			}
			else {
                if(!stack.isEmpty())
				stack.pop();
			}
			
		}
		
		return stack;
	}
    
}