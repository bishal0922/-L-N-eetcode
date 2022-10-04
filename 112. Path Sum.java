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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        //this is recursive solution to the problem
        //I suggest looking at the problem by thinking of a singular root with two children (/leafs)
        //Since its recursive the root node can be considered any normal node
        
        
        //if the node is null then there's no sum
        if (root == null) return false;
        
        //if the node has no children then its a leaf, if the value within the end of the -()-()-() is the solution then we accept (return true)
        if (root.left == null && root.right == null && root.val == targetSum) return true;
        
        //if neither occurs then we move to next children and continue the recursive solution
        //targetSum-root.val because we have to subtract the current node value from the total Sum before we look for the path to the rest of the answer
        
        return hasPathSum(root.right, targetSum-root.val) || hasPathSum(root.left, targetSum-root.val);
    }
}
