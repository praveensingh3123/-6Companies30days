package Microsoft;
import java.util.*;

public class AlienDictionary {
	public String findOrder(String [] dict, int n, int k)
    {
        HashMap<Character,HashSet<Character>>graph=new HashMap<>();
        HashMap<Character,Integer>count=new HashMap<>();
        for(String str:dict)
        {
            for(char ch:str.toCharArray())count.put(ch,0);
        }
        for(int i=0;i<n-1;i++)
        {
            String curr=dict[i];
            String next=dict[i+1];
            int len=Math.min(curr.length(),next.length());
          
            for(int j=0;j<len;j++)
            {
                char ch1=curr.charAt(j);
                char ch2=next.charAt(j);
                if(ch1!=ch2)
                {
                    if(graph.containsKey(ch1))
                    {
                         HashSet<Character>set=graph.get(ch1);
                              set.add(ch2);
                        graph.put(ch1,set); 
                    }
                    else
                    {
                        HashSet<Character>set=new HashSet<>();
                        set.add(ch2);
                        graph.put(ch1,set);
                    }
                    count.put(ch2,count.getOrDefault(ch2,0)+1);
                    break;
                }
            }
        }
        Queue<Character>q=new LinkedList<>();
        
       for(char ch:count.keySet())
       {
           if(count.get(ch)==0)q.add(ch);
       }
       StringBuilder ans=new StringBuilder();
        while(q.size()>0)
        {
            char rem=q.remove();
            ans.append(rem);
            if(ans.length()==k)return ans.toString();
          if(graph.containsKey(rem))
          {
                for(char ch:graph.get(rem))
            {
                int x=count.get(ch);
                x=x-1;
                count.put(ch,x);
                if(count.get(ch)==0)q.add(ch);
            }
          }
            
        }
      //  System.out.println("jj");
        return ans.toString();
    }
}
