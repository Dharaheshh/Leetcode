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
    int res = 0;
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return res;
    }
    public int[] dfs(TreeNode root){
        if(root == null) return new int[]{0,0};
        int[] l = dfs(root.left);
        int[] r = dfs(root.right);
        int sum = root.val + l[0] + r[0];
        int nodec = 1 + l[1] + r[1];
        if(root.val == sum/nodec) res++;
        return new int[]{sum,nodec};
    }
}