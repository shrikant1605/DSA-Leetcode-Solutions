class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        int[][] output = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int count = countNeighbors(board, i, j, m, n);
                
                if(board[i][j] == 1){
                    if(count == 2 || count == 3) output[i][j] = 1;
                    else output[i][j] = 0;
                }
                else{
                    if(count == 3) output[i][j] = 1;
                }
            }
        }
        
        // Copy output back to board
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = output[i][j];
            }
        }
    }
    
    private int countNeighbors(int[][] board, int i, int j, int m, int n){
        int count = 0;
        int[][] dirs = {{-1,-1}, {-1,0}, {-1,1}, {0,-1}, {0,1}, {1,-1}, {1,0}, {1,1}};
        
        for(int[] dir : dirs){
            int ni = i + dir[0];
            int nj = j + dir[1];
            
            if(ni >= 0 && ni < m && nj >= 0 && nj < n && board[ni][nj] == 1){
                count++;
            }
        }
        
        return count;
    }
}