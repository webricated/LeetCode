class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 2) return true;
        return perfectSq(num, 2, num/2);
    }

    public boolean perfectSq(int num, int left, int right){
        if(left > right) return false;
        int mid = left + (right-left)/2;
        long decision = (long) mid * mid;

        if(decision == num) return true;
        else if(decision > num) return perfectSq(num, left, mid-1);
        else return perfectSq(num, mid+1, right);
    }

}