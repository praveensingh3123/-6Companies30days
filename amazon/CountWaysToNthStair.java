package amazon;

public class CountWaysToNthStair {
	Long countWays(int m)
    {
        // your code here
        if(m == 1)
            return (long)1;
        
        long storage[] = new long[m+1];
        storage[0] = storage[1] = 1;
        
        for(int i=2;i<m+1;i++)
        {
            if(i%2 == 0)
                storage[i] = storage[i-2] +1;
            else
                storage[i] = storage[i-1];
        }
        
        return storage[m];
    }    
}
