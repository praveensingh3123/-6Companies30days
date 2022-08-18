package Microsoft;
import java.util.*;

public class ConnectNodeAtSameLevel {
	 public void connect(Node root)
	    {
	      Queue<Node> queue=new LinkedList<>();
	      queue.add(root);
	      while(!queue.isEmpty()){
	          int n=queue.size();
	          for(int i=0;i<n;i++){
	              Node current=queue.poll();
	              if(i==n-1)
	                current.nextRight=null;
	              else
	                current.nextRight=queue.peek();
	              if(current.left!=null)
	                queue.add(current.left);
	              if(current.right!=null)
	                queue.add(current.right);
	          }
	      }
	    }
}
