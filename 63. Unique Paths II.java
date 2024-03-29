class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int wide = obstacleGrid[0].length;
        int[] dp = new int[wide];
        dp[0]=1;

        for(int[] row : obstacleGrid){
            for(int j=0; j<wide; j++){
                if(row[j] == 1){
                    dp[j]=0;
                }
                else if(j>0){
                    dp[j] = dp[j] + dp[j-1];
                }
            }
        }

        return dp[wide-1];

    }
}
