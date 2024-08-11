import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char cr= s.charAt(i);
            if(cr=='('){
                stack.push(')');
            }else if(cr=='{'){
                stack.push('}');
            }else if(cr== '['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop()!=cr){
                return false;
            }
        }
        return stack.isEmpty();
    }
}