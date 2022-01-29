package Microsoft;
import java.util.*;

public class BridgeEdge {
	static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        // code here
        int init_comps = find_comp(V,adj);

        adj.get(c).remove(new Integer(d));
        adj.get(d).remove(new Integer(c));

        int fin_comps = find_comp(V,adj);



       if(fin_comps==init_comps+1){
        return 1;
       }
       return 0;
    


        // return 0;
    }

    public static int find_comp(int V, ArrayList<ArrayList<Integer>> adj){
        boolean visited[] = new boolean[V];
        ArrayList<ArrayList<Integer>>comps = new ArrayList<>();
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                ArrayList<Integer>comp = new ArrayList<>();
                drawTree(adj,i,comp,visited);
                comps.add(comp);

            }
        }
        return comps.size();
    }

    public static void drawTree(ArrayList<ArrayList<Integer>> adj,int src,ArrayList<Integer>comp,boolean visited[]){
    	visited[src] = true;
    	comp.add(src);
    	for(int nbr:adj.get(src)){
    		if(visited[nbr]==false){
    			drawTree(adj,nbr,comp,visited);
    		}
    	}
    }
}
