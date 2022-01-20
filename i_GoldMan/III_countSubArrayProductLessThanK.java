package i_GoldMan;

public class III_countSubArrayProductLessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] a = {1,2,3,4,5,6,7,8,9};
		int ans = countSubArrayProductLessThanK(a, 9, 11);
		System.out.println(ans);
	}
	public static int countSubArrayProductLessThanK(long a[], long n, long k)
    {   int count = 0;
        int i=0;int j=0;
        long p=1;
        while(j<n){
            p*= a[j];
            while(i <n && p>=k){
                p = p/a[i];
                i++;
            }
            if(p<k){
                count += j-i+1;
            }
            j++;
        }
        return count;
    }
}
