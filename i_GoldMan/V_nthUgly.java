package i_GoldMan;

public class V_nthUgly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long ans = getNthUglyNo(10);
		System.out.println(ans);
	}
	public static long getNthUglyNo(int n) {
        // code here
        long[] dp = new long[n+1];
        int p2 = 1;
        int p3 = 1;
        int p5 = 1;
        dp[1] = 1;
        for(int i = 2; i<=n; i++){
            long f2 = 2*dp[p2];
            long f3 = 3*dp[p3];
            long f5 = 5*dp[p5];
            dp[i] = Math.min(f2, Math.min(f3, f5));
            
            if(dp[i] == f2){
                p2++;
            }
            if(dp[i] == f3){
                p3++;
            }
            if(dp[i] == f5){
                p5++;
            }
        }
        return dp[n];
    }
}
