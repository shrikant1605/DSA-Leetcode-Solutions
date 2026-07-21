class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            TreeNode rightmost = null;
            
            for (int i = 0; i < levelSize; i++) {
                rightmost = queue.poll();
                if (rightmost.left != null) queue.add(rightmost.left);
                if (rightmost.right != null) queue.add(rightmost.right);
            }
            
            list.add(rightmost.val);
        }
        
        return list;
    }
}