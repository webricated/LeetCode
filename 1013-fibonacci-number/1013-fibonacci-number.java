class Solution {
    int[] memo = new int[31];
    public int fib(int n) {
        if(n <= 1) return n;

        if(memo[n] != 0) return memo[n];

        memo[n] = fib(n-1) + fib(n-2);
        return memo[n];
    }
}