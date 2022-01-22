package i_GoldMan;

public class MinSizeSubArrSum {
	 public int minSubArrayLen(int target, int[] nums) {
		 int interval = Integer.MAX_VALUE;
	        int i =0, j=0;
	        int sum = 0;
	        while(j<nums.length){   
	            sum += nums[j];
	            while(sum >= target) {
	                interval = Math.min(interval, j-i+1);
	                sum -= nums[i];
	                i++;
	            }
	            j++;    
	        }
	        if(interval == Integer.MAX_VALUE)return 0;
	        return interval;
	 }
}
