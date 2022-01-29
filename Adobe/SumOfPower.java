package Adobe;

public class SumOfPower {
	static int mod = 1000000007;
    static int numOfWays(int n, int x)
    {
        // code here
        int count = 0;
       int[] dp = new int[n+1];
       Arrays.fill(dp , 0);
       dp[0] = 1;
       for(int i = 1;i<= n;i++){
           for(int j = n;j>=i;j--){
           int y =(int)Math.pow(i,x);
           if(j >= y){
               dp[j] = (dp[j]+dp[j-y])%mod;
           }
               
           }
       }
       return dp[n];
    }
}
