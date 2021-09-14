class Solution {
    public int uniquePaths(int m, int n) {
         if(m==0 || n==0){
        return 0;
    }
   int[] dp = new int[n]; 
   
    dp[n-1]=1;
    
    for(int i=m-1;i>=0;i--){
        for(int j=n-2;j>=0;j--){
                 dp[j] +=dp[j+1];     
            
        }
        
    }       
    return dp[0];
    
}
    }
