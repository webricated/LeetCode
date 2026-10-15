class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int ans = target - nums[i];
            
            if(map.containsKey(ans)) 
                return new int[] {map.get(ans), i};

            map.put(nums[i], i);
        }
        return new int[] {};
    }
}