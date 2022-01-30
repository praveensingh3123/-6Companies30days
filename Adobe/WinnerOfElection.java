package Adobe;

public class WinnerOfElection {
	public static String[] winner(String arr[], int n)
    {
        // add your code
        
        String name="";int votes=0;
       String res[]=new String[2];
       Map<String,Integer> map = new TreeMap<>();
       for(int i=0;i<n;i++)
       {
           if(map.containsKey(arr[i]))
           map.put(arr[i],map.get(arr[i])+1);
           else
           map.put(arr[i],1);
       }
       
       
       Set<String> set = map.keySet();
       for(String s:set)
       {
           if(map.get(s)>votes)
           {
               name=s;
               votes=map.get(s);
           }
       }
       
       res[0]=name;
       res[1]=String.valueOf(votes);
       return res;
    }
}
