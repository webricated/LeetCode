class Solution {
    public int fib(int n) {
        int a = 0; // 0th Term
        int b = 1; // 1st Term
        int c;     // Next Term
        for(int i = 1; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
}