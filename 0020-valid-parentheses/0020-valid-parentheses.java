class Solution {
    public boolean isValid(String s) {
        Stack<Character> ch = new Stack<>();

        for(Character c : s.toCharArray()){
            if(c == '('){
                ch.push(')');
            }
            else if(c == '{'){
                ch.push('}');
            }
            else if(c == '['){
                ch.push(']');
            }
            else if(ch.isEmpty() || ch.pop() != c){
                return false;
            }
        }
        return ch.isEmpty();
    }
}