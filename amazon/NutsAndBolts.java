package amazon;
import java.util.*;
public class NutsAndBolts {
	 void matchPairs(char nuts[], char bolts[], int n) {
	        
	     char[] order = {'!', '#', '$', '%', '&', '*', '@', '^', '~'};
       String nuts1 = Arrays.toString(nuts);
       int j = 0;
       for(int i = 0 ; i < order.length ; i ++)
       {
           if(nuts1.contains(Character.toString(order[i])))
           {
               nuts[j] = order[i];
               bolts[j]= order[i];
               j++;
               if(j == n)
                   break;
           }
       }
   }
}
