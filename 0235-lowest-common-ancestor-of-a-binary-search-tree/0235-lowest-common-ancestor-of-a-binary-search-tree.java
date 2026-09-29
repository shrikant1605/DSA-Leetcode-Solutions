/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode result = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        helper(root,p,q);
        return result;
    }
    void helper(TreeNode root, TreeNode p, TreeNode q){
        if(root == null)return;
        if(root.val == p.val || root.val == q.val){
            result = root;
            return;
        }
        if(root.val<p.val && root.val<q.val){
            helper(root.right,p,q);
            return;
        }
        else if(root.val>p.val && root.val>q.val){
            helper(root.left,p,q);
            return;
        }
        result = root;
        return;
    }
}