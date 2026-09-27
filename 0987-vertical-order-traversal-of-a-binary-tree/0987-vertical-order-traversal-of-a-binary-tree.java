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
class Pair {
    TreeNode node;
    int col;
    int row;

    Pair(TreeNode node, int col,int row) {
        this.node = node;
        this.col = col;
        this.row = row;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if(root==null)return null;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root,0,0));
        HashMap<Integer,List<int[]>> map = new HashMap<>();
        while(!queue.isEmpty()){
            Pair p = queue.poll();
            TreeNode temp = p.node;
            map.putIfAbsent(p.col,new ArrayList<>());
            map.get(p.col).add(new int[]{p.row, temp.val});
            if(temp.left!=null)queue.add(new Pair(temp.left,p.col-1,p.row+1));
            if(temp.right!=null)queue.add(new Pair(temp.right,p.col+1,p.row+1));
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sortedCols = new ArrayList<>(map.keySet());
        Collections.sort(sortedCols);

        for (int col : sortedCols) {
            List<int[]> entries = map.get(col);
            entries.sort((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);

            List<Integer> colValues = new ArrayList<>();
            for (int[] entry : entries) {
                colValues.add(entry[1]);
            }
            result.add(colValues);
        }
        return result;

        
    }
}