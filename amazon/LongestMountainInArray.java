package amazon;

public class LongestMountainInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,4,7,3,2,5};
		int ans = longestMountain(arr);
		System.out.println(ans);
	}
	public static int longestMountain(int[] arr) {
        int maxLength = 0;
        int i = 0, j = 0;
        boolean increasing = false, decreasing = false;
        
        while(i < arr.length - 2) {
            while(i < arr.length - 1 && arr[i] >= arr[i + 1]) {
                i++;
            }
            increasing = false; 
            decreasing = false;
            
            j = i;
            while(j < arr.length - 1 && arr[j] < arr[j + 1]) {
                increasing = true;
                j++;
            }
            while(j < arr.length - 1 && arr[j] > arr[j + 1]) {
                decreasing = true;
                j++;
            }
            if(increasing && decreasing) maxLength = Math.max(maxLength, j - i + 1);
            i = j;
        }
        if(increasing && decreasing) maxLength = Math.max(maxLength, j - i + 1);
        return maxLength >= 3 ? maxLength : 0;
    }
}
