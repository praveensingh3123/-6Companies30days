package i_GoldMan;

public class VII_KidGetsDamagedToy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = kidGetsDamagedToy(5,8,2);
		System.out.println(ans);
	}
	public static int kidGetsDamagedToy(int n, int m, int k) {
		int ans = (m+k-1)%n;
		if(ans == 0) {
			return n;
		}
		return ans;
	}
}
