class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int max = 0;
        for (int num : nums2) max = Math.max(max, num);
        int[] nge = new int[max + 1];
        Arrays.fill(nge, -1);

        Deque<Integer> stack = new ArrayDeque<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nge[stack.pop()] = num;
            }
            stack.push(num);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) ans[i] = nge[nums1[i]];
        return ans;
    }
}