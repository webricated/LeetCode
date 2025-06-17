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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //BFS
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        boolean isForward = true;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelArr = new LinkedList<>();

            while (levelSize-- > 0) {
                TreeNode node = queue.poll();
                if (isForward) levelArr.addLast(node.val);
                else levelArr.addFirst(node.val);
                
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            ans.add(levelArr);
            isForward = !isForward;
        }
        return ans;
    }
}