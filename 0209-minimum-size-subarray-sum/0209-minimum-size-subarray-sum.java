class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int currSum = 0;

        for(int right = 0; right < nums.length; right++){
            currSum += nums[right];

            while(currSum >= target){
                if((right - left + 1) < minLen){
                    minLen = right - left + 1;
                }
                currSum -= nums[left];
                left++;
            }
        }
        return minLen != Integer.MAX_VALUE ? minLen : 0;
    }
}