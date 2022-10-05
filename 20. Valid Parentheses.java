class Solution {
    public boolean isValid(String s) {
        
        //the solution is pretty intuitive
        //we are looking for pairs in series, if true then valid
        //if any odd behaviour then its not valid
        
        //stack implementation
        Stack<Character> stack = new Stack<>();
        
        //looping through every character in the string(as character array)
        for (char c: s.toCharArray()){
            
            //if we find any of the starting 3 (,{,[ then we add their complement ),},] to the stack
            if (c == '('){
                stack.push(')');
            } else if (c == '{'){
                stack.push('}');
            } else if (c == '['){
                stack.push(']');
                
            //if the stack is empty then not valid
            //or if the top element isn't the same as the current element then they're not a pair and we return false
            } else if (stack.empty() || stack.pop() != c){
                return false;
            }
        }
        
        //if the string has proper pairs then the stack has to be empty, hence empty==valid non-empty==invalid
        return stack.empty();
    }
}
