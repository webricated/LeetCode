/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        return summation(root, 0);
    }
    public int summation(TreeNode node, int currSum){
        if(node == null) return 0;
        currSum = currSum * 10 + node.val;
        if(node.left == null && node.right == null) return currSum;
        return summation(node.left, currSum) + summation(node.right, currSum);
    }
}