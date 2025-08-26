
class Solution {
    public int findDuplicate(int[] nums) {
        int[] modified = Arrays.copyOf(nums, nums.length);
        Arrays.sort(modified);

        for(int i = 0; i < modified.length; i++){
            if(modified[i] == modified[i+1]){
                return modified[i];
            }
        }
        return -1;
    }
}

