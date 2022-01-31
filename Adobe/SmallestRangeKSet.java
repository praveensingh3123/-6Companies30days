package Adobe;
import java.util.*;

public class SmallestRangeKSet {
	static int[] findSmallestRange(int[][] KSortedArray,int n,int k)
	{
	    int[] ans = {-1000000, 1000000};
        int max = Integer.MIN_VALUE;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
        for (int i = 0; i < k; i++) {
            int val = KSortedArray[i][0];
            max = Math.max(val, max);
            pq.add(new int[]{val, 0, i});
        }
        while (true) {
            int[] rem = pq.poll();
            if (ans[1] - ans[0] > max - rem[0]) {
                ans[0] = rem[0];
                ans[1] = max;
            }
            rem[1]++;
            if (rem[1] == KSortedArray[rem[2]].length)
                break;
            else {
                max = Math.max(max, KSortedArray[rem[2]][rem[1]]);
                pq.add(new int[]{KSortedArray[rem[2]][rem[1]], rem[1], rem[2]});
            }
        }
        return ans;
	}
}
