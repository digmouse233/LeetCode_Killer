/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    private int res = 0;

    public int goodNodes(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);
        return res;
    }

    private void dfs(TreeNode root, int maxSoFar) {
        if (maxSoFar <= root.val) {
            res++;
        }

        if (root.left != null) {
            dfs(root.left, Math.max(maxSoFar, root.val));
        }

        if (root.right != null) {
            dfs(root.right, Math.max(maxSoFar, root.val));
        }
    }
}