package amazon;

public class MaximumProfit {
	public static void main(String[] args) {
		int[] arr = {10, 22, 5, 75, 65, 80};
		int ans = maxProfit(2, 6, arr);
		System.out.println(ans);
	}
	static int maxProfit(int K, int N, int A[]) {
        if(K==0)
        return 0;
        Integer[][][] dp=new Integer[K+1][N+1][2];
        return chec(K-1,A,0,false,dp);
    }
    static int chec(int K,int A[],int pos,boolean flag,Integer[][][] dp)
    {
        if(pos>=A.length||K==-1)
        return 0;
        int a=0,b=0;
        int t=flag==true?1:0;
        if(dp[K][pos][t]!=null)
            return dp[K][pos][t];
        if(flag==false)
        {
            a=chec(K,A,pos+1,true,dp)-A[pos];
            b=chec(K,A,pos+1,flag,dp);
        }
        else
        {
            a=A[pos]+chec(K-1,A,pos+1,false,dp);
            b=chec(K,A,pos+1,flag,dp);
        }
        return dp[K][pos][t]=Math.max(a,b);
    }
}
