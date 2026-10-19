class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(num : nums){
        //     if(map.containsKey(num)) return true;
        //     else map.put(num, 1);
        // }

        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)) return true;
            else set.add(num);
        }
        return false;
    }
}