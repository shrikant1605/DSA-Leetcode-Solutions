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
    int i = 0;
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = null;
        return helper(root,0, nums.length-1,nums);
    }
    TreeNode helper(TreeNode root,int left, int right,int[] nums){
        if(left>right)return null;
        int mid = left + (right-left)/2;
        root = new TreeNode(nums[mid]);
        root.left = helper(root.left,left,mid-1,nums);
        root.right = helper(root.right, mid+1,right,nums);
        return root;
    }
}