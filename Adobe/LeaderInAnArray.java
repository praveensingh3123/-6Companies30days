package Adobe;

public class LeaderInAnArray {
	static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> a=new ArrayList<Integer>();
        int[] a1=new int[n];
        int k=-1;
        for (int i=arr.length-1;i>=0;i--)
        { 
            if(arr[i]>=k)
            {
                k=arr[i];
                
                    
                    a.add(arr[i]);
            }
        }
        
        int i=0;
        int j=a.size()-1;
        while(i<j)
        {
            int temp=a.get(i);
            a.set(i,a.get(j));
            a.set(j,temp);
            i++;
            j--;
        
        }
        
        return a;
    }
}
