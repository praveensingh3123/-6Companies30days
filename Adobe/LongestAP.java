package Adobe;

public class LongestAP {
	int lengthOfLongestAP(int[] A, int n) {
        if (n <= 2) return n;
        int[][] dp = new int[n][10001];
        int ans = 0;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                int dif = A[j]-A[i];
                dp[j][dif] = Math.max(dp[i][dif]+1, 2);
                ans = Math.max(ans, dp[j][dif]);
            }
        }
        return ans;
    }
}
