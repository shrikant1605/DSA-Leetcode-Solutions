class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> g =new ArrayList<>();
        for(int i=0;i<numCourses;i++)g.add(new ArrayList<>());
        int[] state = new int[numCourses];
        for(int p[]:prerequisites)g.get(p[1]).add(p[0]);
        for(int i=0;i<numCourses;i++)if(state[i]==0 && dfs(i,g,state))return false;
        return true;
    }

    boolean dfs(int u, List<List<Integer>> g,int[] state){
        state[u] = 1;
        for(int i:g.get(u)){
            if(state[i]==1)return true;
            if(state[i]==0 && dfs(i,g,state))return true;
        }
        state[u]=2;
        return false;
    }
}