package Microsoft;
import java.util.*;

public class PreRequisiteTask {
	public boolean isPossible(int N, int[][] prerequisites)
    {
        // Your Code goes here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        int indegree[]=new int[N];
        
        
        for(int i=0;i<N;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int[] prerequisite:prerequisites){
            adj.get(prerequisite[1]).add(prerequisite[0]);
        }
        
        for(int i=0;i<N;i++){
            for(int num:adj.get(i)){
                indegree[num]++;
            }
        }
        
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> topoSort=new ArrayList<Integer>();
        
        for(int i=0;i<N;i++){
            if(indegree[i]==0)  q.add(i);
        }
        
        while(!q.isEmpty()){
            int node=q.poll();
            topoSort.add(node);
            for(int num:adj.get(node)){
                indegree[num]--;
                if(indegree[num]==0)    q.add(num);
            }
        }
        
        return topoSort.size()==N;
        
    }
}
