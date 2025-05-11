class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int cpy = x;
        int rev = 0;
        int rem;
        while(cpy != 0){
            rem = cpy % 10;
            rev = rev * 10 + rem;
            cpy /= 10;
        }
        return x == rev;
    }
}