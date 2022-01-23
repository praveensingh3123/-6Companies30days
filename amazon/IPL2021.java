package amazon;
import java.util.*;
public class IPL2021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> list = max_of_subarrays(new int[] {1,2,3,4,5,5,6,4}, 8, 3);
        System.out.println(list);
	}
	static ArrayList<Integer> max_of_subarrays(int a[], int n, int k) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        Deque<Integer> q = new ArrayDeque<>();
		for(int i=0; i<k; i++) {
			while(!q.isEmpty() && a[q.peekLast()] <= a[i]) {
				q.removeLast();
			}
			q.addLast(i);
		}
		for(int i=k; i<a.length; i++) {
		    list.add(a[q.peek()]);
			while(!q.isEmpty() && q.peek() <= i-k) {
				q.removeFirst();
			}
			while(!q.isEmpty() && a[q.peekLast()] <= a[i]) {
				q.removeLast();
			}
			q.addLast(i);
		}
		list.add(a[q.peek()]);
		return list;
    }

}
