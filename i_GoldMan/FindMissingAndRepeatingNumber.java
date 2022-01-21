package i_GoldMan;

public class FindMissingAndRepeatingNumber {
	int[] findTwoElement(int arr[], int n) {
	       int i=0;
	        while(i<n){
	            int correct=arr[i]-1;
	            if(arr[i]!=arr[correct]){
	                swap(arr,i,correct);
	            }
	            else{
	                i++;
	            }
	        }
	        int ans[]=new int[2]; 
	        for(int j=0;j<n;j++){
	            if(arr[j]!=j+1){
	                ans[0]=arr[j];
	                ans[1]=j+1;
	            }
	        }
	        return ans;
	    }
	    void swap(int arr[], int start, int end){
	        int temp=arr[start];
	        arr[start]=arr[end];
	        arr[end]=temp;
	    }
}
