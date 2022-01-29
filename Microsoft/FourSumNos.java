package Microsoft;
import java.util.*;

public class FourSumNos {
	public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Set<ArrayList<Integer>> ans2 = new HashSet<>();
        
         Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int low=j+1,high=arr.length-1;
                while(low<high){
                   int rem = k-(arr[i]+arr[j]);
                    if(rem==arr[low]+arr[high]){
                        ArrayList<Integer> ans1 = new ArrayList<>();
                        ans1.add(arr[i]);
                        ans1.add(arr[j]);
                        ans1.add(arr[low]);
                        ans1.add(arr[high]);
                        if(!ans.contains(ans1)){
                            ans.add(ans1);
                            ans2.add(ans1);
                            
                        }
                         low++;
                        high--;
                    }
                    else if(rem>arr[low]+arr[high]){
                        low++;
                    }else{
                        high--;
                    }
                   
                     
                }
            }
        }
      
        return ans;
    }
}
