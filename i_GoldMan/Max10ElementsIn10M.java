package i_GoldMan;
import java.util.*;
public class Max10ElementsIn10M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100000000];
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i<10; i++) {
			pq.add(arr[i]);
		}
		for(int i = 10; i<arr.length; i++) {
			if(arr[i] >pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		
		for(int j : pq) {
			System.out.println(j);
		}
	}
	

}
