class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length, cols = obstacleGrid[0].length;
        if(obstacleGrid[rows-1][cols-1] == 1){
            return 0;
        }
        obstacleGrid[rows-1][cols-1] = 1;
        
        // find the number of ways to reach the destination from the last column
        for(int i=rows-2; i>=0; i--){
            obstacleGrid[i][cols-1] = (obstacleGrid[i][cols-1]==1) ? 0 : obstacleGrid[i+1][cols-1];
        }
        
        // find the number of ways to reach the destination from the last row
        for(int i=cols-2; i>=0; i--){
            obstacleGrid[rows-1][i] = (obstacleGrid[rows-1][i]==1) ? 0 : obstacleGrid[rows-1][i+1];
        }
        
        // if the cell is already 1, it has an obstacle, and hence the number of ways to reach the destination is 0.
        // calculate the number of ways to reach the destination based on the cells on the right and down.
        for(int i=rows-2; i>=0; i--){
            for(int j=cols-2; j>=0; j--){
                if(obstacleGrid[i][j] == 1){
                    obstacleGrid[i][j] = 0;
                }else{
                    obstacleGrid[i][j] = obstacleGrid[i+1][j] + obstacleGrid[i][j+1];
                }
            }
        }
        
        return obstacleGrid[0][0];
    }
}