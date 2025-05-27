class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 2) return true;
        if(num < 101){
            for(int i = 2; i < (num/2)+1; i++){
            if(i*i == num) return true;
            }
        }
        else if(num >= 101){
            for(int i = 2; i < (num/10)+1; i++){
            if(i*i == num) return true;
            }
        }
         return false;
    }
}