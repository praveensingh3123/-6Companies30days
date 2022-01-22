package i_GoldMan;

public class ArrPairSumDivisibity {
	public boolean canPair(int[] nums, int k) {
        // Code here
       int n = nums.length;
        if(n%2 != 0) {
            return false;
        }
        
        int[] rem = new int[k];
        for(int i=0; i<n; i++) {
            rem[nums[i]%k]++;
        }
        
        if(rem[0] % 2 != 0) {
            return false;
        }
        
        int i=1;
        int j=k-1;
        while(i<j) {
            if(rem[i] != rem[j]) {
                return false;
            }
            i++;
            j--;
        }
        
        if(i == j && rem[i]%2 != 0) {
            return false;
        }
        return true;
    }
}
