class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 2) return true;
        if(num < 401){
            for(int i = 2; i < (num/2)+1; i++){
            if(i*i == num) return true;
            }
        }
        else if(num >= 401){
            for(int i = 2; i < (num/28)+1; i++){
            if(i*i == num) return true;
            }
        }
         return false;
    }
}