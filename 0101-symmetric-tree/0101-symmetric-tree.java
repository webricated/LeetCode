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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isMirror(root.left, root.right);
    }
    public boolean isMirror(TreeNode a1, TreeNode a2) {
        if(a1 == null && a2 == null) return true;
        if(a1 == null || a2 == null) return false;

        return (a1.val == a2.val) &&
        isMirror(a1.left, a2.right) &&
        isMirror(a1.right, a2.left);
    }
}