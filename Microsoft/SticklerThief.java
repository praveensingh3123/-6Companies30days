package Microsoft;

public class SticklerThief {
	public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int large=0;
        if(n==1) return arr[0];
        if(n==2) return Math.max(arr[1],arr[0]);
        else{
            int m = arr[0];
            int o = Math.max(arr[0],arr[1]);
            for(int i=2;i<n;i++){
                large = Math.max(o,m+arr[i]);
                m=o;
                o=large;
            }
        }
        return large;
    }
}
