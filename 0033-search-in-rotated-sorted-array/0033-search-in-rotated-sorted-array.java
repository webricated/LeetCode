class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        // Searching value in range
        while(left <= right){
            int mid = left + (right - left)/2; // Avoids Overflow
            if(nums[mid] == target) return mid;
            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
// int -> 10
// avg -> a=5, b=8 -> 6.5
// (start+end)/2 => 13/2

// start + (end - start)/2 => 5 + (3)/2 => 5 + 1.5 => 6.5


//         l      mid      r
// 0   1   2   3   4   5   6
// 5   8   12  13  15  17  19

// k = 3
//             l   mid r
// 0   1   2   3   4   5   6
// 13  15  17  19  5   8   12