class Solution {
    public boolean isPalindrome(int x) {
        int copy = x;
        int reversed = 0;
        while(x > 0){
            int rem = x % 10;
            reversed = (reversed * 10) + rem;
            x /= 10;
        }
        return copy == reversed;
    }
}