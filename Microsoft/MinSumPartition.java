package Microsoft;

public class MinSumPartition {
	public int minDifference(int nums[], int n) 
	{ 
        int totalSum=0;
        for(int i=0;i<nums.length;i++)
            totalSum+=nums[i];
        int dp[][]=new int [n+1][(totalSum/2)+1]; 
        for(int i=1;i<n+1;i++){
            for(int j=1;j<(totalSum/2)+1;j++){
                if(nums[i-1]<=j)
                    dp[i][j]=Math.max(nums[i-1]+dp[i-1][j-nums[i-1]],dp[i-1][j]);
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return Math.abs((totalSum-dp[n][totalSum/2])-dp[n][totalSum/2]);
	}
}
