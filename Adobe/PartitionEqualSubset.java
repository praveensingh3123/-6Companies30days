package Adobe;

public class PartitionEqualSubset {
	static int equalPartition(int n, int a[])
    {
        int sum=0;
        for(int ele:a)  sum+=ele;
        if(sum%2==1)    return 0;
        sum/=2;
        boolean dp[][]=new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(i==0)    dp[i][j]=false;
                else if(j==0)   dp[i][j]=true;
                else if(j<a[i-1])   dp[i][j]=dp[i-1][j];
                else    dp[i][j]=dp[i-1][j-a[i-1]] || dp[i-1][j];
                if(dp[i][sum])  return 1;
            }
        }return dp[n][sum]?1:0;
    }
}
