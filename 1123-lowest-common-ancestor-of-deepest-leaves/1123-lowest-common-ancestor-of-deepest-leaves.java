class Solution {

    class Pair {
        int depth;
        TreeNode node;

        Pair(int depth, TreeNode node) {
            this.depth = depth;
            this.node = node;
        }
    }

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return solve(root).node;
    }

    private Pair solve(TreeNode root) {

        if (root == null) {
            return new Pair(0, null);
        }

        Pair left = solve(root.left);
        Pair right = solve(root.right);

        if (left.depth > right.depth) {
            return new Pair(left.depth + 1, left.node);
        }

        if (right.depth > left.depth) {
            return new Pair(right.depth + 1, right.node);
        }

        return new Pair(left.depth + 1, root);
    }
}