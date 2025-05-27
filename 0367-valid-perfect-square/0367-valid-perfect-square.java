class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 10){
            for(int i = 1; i <= (num/2)+1; i++){
            if(i*i == num) return true;
            }
        }
        else{
            for(int i = 1; i <= (num/3)+1; i++){
            if(i*i == num) return true;
            }
        }
        return false;
    }
}