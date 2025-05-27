public class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        return isPerfectSquareHelper(num, 2, num / 2);
    }

    private boolean isPerfectSquareHelper(int num, long left, long right) {
        if (left > right) return false;

        long mid = left + (right - left) / 2;
        long square = mid * mid;

        if (square == num) return true;
        else if (square < num) return isPerfectSquareHelper(num, mid + 1, right);
        else return isPerfectSquareHelper(num, left, mid - 1);
    }
}
