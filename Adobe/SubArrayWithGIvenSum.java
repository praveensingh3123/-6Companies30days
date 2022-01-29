package Adobe;
import java.util.*;

public class SubArrayWithGIvenSum {
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
      ArrayList<Integer> result = new ArrayList<>();
      int start =0;
      int end =0;
      int currentsum =0;
      
      while(end<n){
          currentsum += arr[end];
          
          if(currentsum==s){
              result.add(start+1);
              result.add(end+1);
              return result;
          }
          while(currentsum > s){
              currentsum -= arr[start];
              start++;
              
              if(currentsum == s){
                  result.add(start+1);
                  result.add(end+1);
                  return result;
              }
          }
          
          if(currentsum<s){
              end++;
          }
      }
      
      result.add(-1);
      return result;
    }
}
