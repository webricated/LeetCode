class Solution {
    static {
        for(int i = 0; i < 200; i++) removeStars("");
    }
    public static String removeStars(String s) {
        char stack [] = s.toCharArray();
        int idx = 0;
        
         for(int i = 0; i < stack.length; i++) {
            if(stack[i] != '*') stack[idx++] = stack[i];
            else idx--;     
         }   
         return new String(stack, 0, idx);
    }
}