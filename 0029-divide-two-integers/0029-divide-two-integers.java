class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1) return 2147483647;
        return dividend/divisor;
    }
}

// class Solution {
//     public int divide(int dividend, int divisor) {
//         if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

//         long x = Math.abs((long)dividend);
//         long y = Math.abs((long)divisor);
//         int ans = 0;

//         while(x >= y){
//             long temp = y;
//             int multi = 1;

//             while(x >= (temp << 1)){
//                 temp <<= 1;
//                 multi <<= 1;
//             }
//             x -= temp;
//             ans += multi;
//         }
//         return (dividend > 0) == (divisor > 0) ? ans : -ans;
//     }
// }