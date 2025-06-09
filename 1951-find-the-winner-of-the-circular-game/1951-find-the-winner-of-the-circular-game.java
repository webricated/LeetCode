class Solution {
    public int findTheWinner(int n, int k) {
        // Using Recursion
        if (n == 1) return 1;
        return (findTheWinner(n-1, k) + k - 1) % n + 1;
    }
}