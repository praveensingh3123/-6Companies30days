package Adobe;
import java.util.*;

public class GeneratePeranthesis {
	List<String> paranthesisList;   
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        paranthesisList=new LinkedList<String>();
        generateParanthesis("",n,0);
        return paranthesisList;
    }
    private void generateParanthesis(String str,int n,int m)
    {
        if(m==0 && n==0)
        {
            paranthesisList.add(str);
            return;
        }
        if(m>0)
            generateParanthesis(str+")",n,m-1);
        if(n>0)
            generateParanthesis(str+"(",n-1,m+1);
    }
}
