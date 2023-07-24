class Solution {
    public boolean isValid(String s) {
        
    Stack<Character> stk = new Stack<>();

    for(char c : s.toCharArray()){
        if(c=='(')
            stk.push(')');

        else if(c=='{') 
            stk.push('}');  

        else if(c=='[') 
            stk.push(']'); 

        else if(stk.isEmpty())
            return false;

        else if(c != stk.pop())
            return false;

    } 

    return stk.isEmpty();    
    }
}
