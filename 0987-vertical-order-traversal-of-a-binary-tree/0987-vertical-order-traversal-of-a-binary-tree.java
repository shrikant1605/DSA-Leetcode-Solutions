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
class Table{
    int row;
    int col;
    TreeNode root;
    Table(int row,int col, TreeNode root){
        this.row = row;
        this.col = col;
        this.root = root;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if(root == null)return null;
        Queue<Table> queue = new LinkedList<>();
        queue.add(new Table(0,0,root));
        HashMap<Integer,List<int[]>> map = new HashMap<>();
        while(!queue.isEmpty()){
            Table t = queue.poll();
            TreeNode temp = t.root;
            map.putIfAbsent(t.col,new ArrayList<>());
            map.get(t.col).add(new int[]{t.row,temp.val});
            if(temp.left!=null)queue.add(new Table(t.row+1,t.col-1,temp.left));
            if(temp.right!=null)queue.add(new Table(t.row+1,t.col+1,temp.right));
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sorted = new ArrayList<>(map.keySet());
        Collections.sort(sorted);
        for(int i : sorted){
            List<int[]> entries = map.get(i);
            entries.sort((a,b)-> a[0]!=b[0] ? a[0]-b[0]:a[1]-b[1]);
            List<Integer> col = new ArrayList<>();
            for(int[] j : entries){
                col.add(j[1]);
            }
            result.add(col);
        }
        return result;

    }
}