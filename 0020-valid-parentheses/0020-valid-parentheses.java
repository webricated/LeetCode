class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(!stack.isEmpty()){
                char last = stack.peek();
                if(isPair(last, current)){
                    stack.pop();
                    continue;
                }
            }
            stack.push(current);
        }
        return stack.isEmpty();
    }
    public boolean isPair(char last, char current){
        return (last == '(' && current == ')') 
        || (last == '[' && current == ']')
        || (last == '{' && current == '}');
    }
}