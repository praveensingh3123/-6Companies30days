package i_GoldMan;

import java.util.*;
public class DecodeTheString {

	public static String decodedString(String s){
	       Stack<StringBuilder> strStack = new Stack<>();
	        Stack<Integer> numStack = new Stack<>();
	        StringBuilder str = new StringBuilder();
	        int count = 0;
	        for (char ch : s.toCharArray()) {
	            if(Character.isDigit(ch)){
	                count = count*10 + ch-'0';
	            }
	            else if(ch == '['){
	                strStack.push(str);
	                str = new StringBuilder();
	                numStack.push(count);
	                count = 0;
	            }
	            else if(ch == ']'){
	                StringBuilder temp = str;
	                str = strStack.pop();
	                int num = numStack.pop();
	                while(num > 0){
	                    str.append(temp);
	                    num--;
	                }
	            }
	            else{
	                str.append(ch);
	            }
	        }
	        return str.toString();
	  }
}
