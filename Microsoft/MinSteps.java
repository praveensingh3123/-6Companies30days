package Microsoft;

public class MinSteps {
	 static int minSteps(int N){
	        N = Math.abs(N);
	        int i = 0;
	        int steps = 1 ;
	        while( i < N || (i -N ) % 2 != 0 )
	            i+=steps++;
	        return steps-1;
	    }
}
