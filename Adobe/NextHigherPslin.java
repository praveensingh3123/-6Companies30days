package Adobe;

public class NextHigherPslin {
	 public String nextPalin(String N) 
	    { 
	        //complete the function here
	        if(N.length()<=3)
	        {
	            return "-1";
	        }
	        
	        int mid=(N.length()/2) - 1;
	        int ind=-1;
	        for(int i=mid; i>0; i--)
	        {
	            if(N.charAt(i-1)<N.charAt(i))
	            {
	                ind=i-1;
	                break;
	            }
	        }
	        
	        if(ind==-1)
	        {
	            return "-1";
	        }
	        
	        StringBuilder sb = new StringBuilder();
	        sb.append(N);
	        for(int i=mid; i>ind; i--)
	        {
	            if(N.charAt(i)>N.charAt(ind))
	            {
	                //swap
	                char temp=N.charAt(ind);
	                sb.setCharAt(ind, N.charAt(i));
	                sb.setCharAt(i,temp);
	                break;
	            }
	        }
	        
	        int i = ind+1, j=mid;
	        while(i<=j)
	        {
	            char temp=sb.charAt(i);
	            sb.setCharAt(i, sb.charAt(j));
	            sb.setCharAt(j, temp);
	            i++;
	            j--;
	        }
	        
	        int l=0, r=N.length()-1;
	        while(l<=r)
	        {
	            sb.setCharAt(r, sb.charAt(l));
	            l++;
	            r--;
	        }
	        return sb.toString();
	    }
}
