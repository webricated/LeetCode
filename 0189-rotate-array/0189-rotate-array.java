class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
int[] rotatedArray = new int[n];
for(int i = 0; i < n; i++){
    rotatedArray[(i+k) % n] = nums[i];
    }
    for(int i = 0; i < n; i++){
        nums[i] = rotatedArray[i];
    }
    }
}