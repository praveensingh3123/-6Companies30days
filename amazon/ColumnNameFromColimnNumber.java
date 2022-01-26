package amazon;

public class ColumnNameFromColimnNumber {
	String colName (long n)
    {
        String result = "";
        n = n-1;
        while(n > 26) {
            int x = (int)n%26;
            result = (char) (x+65) + result;
            n = n/26;
            n--;
        }
        
        if(n >= 0) result = (char) (n+65) + result;
        
        return result;
    }
}
