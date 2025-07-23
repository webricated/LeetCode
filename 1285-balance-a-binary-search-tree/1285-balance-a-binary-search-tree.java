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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> node = new ArrayList<>();
        inorder(root, node);
        return buildBalBST(node, 0, node.size() - 1);
    }

    public void inorder(TreeNode root, List<Integer> node){
        if(root == null) return;
        inorder(root.left, node);
        node.add(root.val);
        inorder(root.right, node);
    }

    public TreeNode buildBalBST(List<Integer> node, int start, int end){
        if(start > end) return null;

        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(node.get(mid));   
        root.left = buildBalBST(node, start, mid - 1);
        root.right = buildBalBST(node, mid + 1, end);

        return root;
    }
}


