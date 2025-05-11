class Solution {
    public int reverse(int x) {
        int res = 0;
        int sign = (x<0) ? -1 : 1;
        x = Math.abs(x);
        while(x > 0) {
            int rem = x % 10;
            if(res > (Integer.MAX_VALUE - rem) / 10){
                return 0;
            }
            res = res * 10 + rem;
            x = x/10;
        }
        return res * sign;
    }
}