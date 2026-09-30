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
    List<TreeNode> list = new ArrayList<>();
    public void recoverTree(TreeNode root) {
        inorder(root);
        TreeNode root1 = null;
        TreeNode root2 = null;
        TreeNode arr[] = new TreeNode[list.size()];
        int j = 0;
        for(TreeNode i:list){
            arr[j++] = i;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i].val>arr[i+1].val){
                if(root1==null){
                    root1=arr[i];
                    root2 = arr[i+1];
                }
                else root2 = arr[i+1];
            }
        }
        int temp = root1.val;
        root1.val = root2.val;
        root2.val = temp;
    }
    void inorder(TreeNode root){
        if(root == null)return;
        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
}