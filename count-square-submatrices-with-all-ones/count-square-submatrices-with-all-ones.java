class Solution {
    public int countSquares(int[][] matrix) {
        int count=0;
            int m= matrix[0].length;
            int n= matrix.length;
                for(int i=1; i<n; i++)
                        for(int j=1; j<m; j++){
                                if(matrix[i][j]==0) continue;
                                matrix[i][j] = Math.min(Math.min(matrix[i - 1][j], matrix[i][j - 1]), matrix[i - 1][j - 1]) +1;
                        }
            for (int i = 0; i < n; i++)
                   for (int j = 0; j < m; j++)
                        count += matrix[i][j];
     
            
            return count;
    }
}
