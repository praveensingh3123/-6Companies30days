package Microsoft;
import java.util.*;

public class StockSpanProblem {
	public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        Stack<Integer> st = new Stack<>();
        int[] span = new int[n];
        st.push(0);
        span[0] = 1;
        
        for(int i = 1; i < n; i++){
            while(st.size() > 0 && price[i] >= price[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                span[i] = i+1;
            }else{
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }
}
