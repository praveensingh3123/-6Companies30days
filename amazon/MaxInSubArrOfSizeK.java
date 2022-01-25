package amazon;

public class MaxInSubArrOfSizeK {
	 static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
	    {
	        // Your code here
	        HashMap<Integer,Integer> map = new HashMap<>();
	        Stack<Integer> st = new Stack<>();
	        st.push(0);
	        for(int i=1;i<n;i++) {
	            int ele = arr[i];
	            while(!st.isEmpty()&&ele>arr[st.peek()]) {
	                map.put(st.peek(),i);
	                st.pop();
	            }
	            st.push(i);
	        }
	        while(!st.isEmpty())
	        map.put(st.pop(),Integer.MAX_VALUE);
	        ArrayList<Integer> list = new ArrayList<>();
	        int left = 0;
	        int right = 0;
	        while(true) {
	            if(left>=n-k+1)
	            break;
	            if(map.get(right)>left+k-1) {
	                list.add(arr[right]);
	                left++;
	                right = left;
	            }
	            else
	            right = map.get(right);
	            
	            
	            
	        }
	        return list;
	        
	    }
}
