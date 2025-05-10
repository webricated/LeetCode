class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int currSum = 0;
        int minLength = Integer. MAX_VALUE;

        for(right = 0; right < nums.length; right++){
            currSum += nums[right];
            while(currSum >= target){
                if(right-left+1 < minLength){
                    minLength = right-left+1;
                }
                currSum -= nums[left];
                left++;
            }
        }
        return minLength != Integer.MAX_VALUE ? minLength : 0;
    }
}