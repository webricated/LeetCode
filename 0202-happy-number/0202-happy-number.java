class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = nextNum(n);

        while(fast != 1 && slow != fast){
            slow = nextNum(slow);
            fast = nextNum(nextNum(fast));
        }
        return fast == 1;
    }

    private int nextNum(int n){
        int totalSum = 0;
        while(n > 0){
            int digit = n % 10;
            totalSum += (digit * digit);
            n /= 10;
        }
        return totalSum;
    }
}