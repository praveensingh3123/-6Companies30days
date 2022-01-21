package i_GoldMan;
import java.util.*;

public class Number_Following_a_Pattern {
	static String printMinNumberForPattern(String s){
        // code here
        int count =1;
        Stack<String> st = new Stack<>();
        String ans = "";
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == 'D'){
                st.push(String.valueOf(count));
                
            }else{
                st.push(String.valueOf(count));
                while(!st.isEmpty()){
                    ans += st.pop();
                }
            }
            count++;
        }
        st.push(String.valueOf(count));
        while(!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }

}
