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
    long totalsum =0, product =0;
    final int mod = 1000000007;
    public int maxProduct(TreeNode root) {
        totalsum(root);
        subtreeSum(root);
        return (int)(product%mod);
    }
    private long totalsum(TreeNode node){
        if(node== null)
            return 0;
        long sum = node.val+ totalsum(node.left)+totalsum(node.right);
        totalsum = sum;
        return sum;
    }
    private long subtreeSum(TreeNode node){
        if(node==null)
            return 0;
        long currsum = node.val+ subtreeSum(node.left)+subtreeSum(node.right);
        long pro = currsum*(totalsum-currsum);
        product = Math.max(pro, product);
        return currsum;
    }
}