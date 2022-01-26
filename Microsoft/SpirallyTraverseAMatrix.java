package Microsoft;
import java.util.*;

public class SpirallyTraverseAMatrix {
	static ArrayList<Integer> spirallyTraverse(int m[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int a=0;
        int b=0;
        int x=r-1;
        int y=c-1;
        while(a<=x && b<=y )
        {
            for(int i=b;i<=y;i++)
            {
                ar.add( m[a][i] );
            }
            a++;
            for(int i=a;i<=x;i++)
            {
                ar.add( m[i][y] );
            }
            y--;
            if(a<=x)
            {
                for(int i=y;i>=b;i--)
                {
                    ar.add( m[x][i] );
                }
                x--;
            }
            if(b<=y)
            {
                for(int i=x;i>=a;i--)
                {
                    ar.add( m[i][b] );
                    
                }
                b++;
            }
        }
        return ar;
    }
}
