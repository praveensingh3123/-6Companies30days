package amazon;
import java.util.*;

public class TreeBurning {
	 public static int minTime(Node root, int target) {
	        Map<Node,Node> map = new HashMap<>();
	        Queue<Node> queue = new LinkedList<>();
	        Set<Node> visited = new HashSet<>();
	        Node start = null;
	        int time = -1;
	        
	        queue.add(root);
	        map.put(root,null);
	        
	        while(!queue.isEmpty()){
	            Node temp = queue.poll();
	            
	            start = temp.data == target ? temp : start;
	            
	            if(temp.left!=null){
	                queue.add(temp.left);
	                map.put(temp.left,temp);
	            }
	            if(temp.right!=null){
	                queue.add(temp.right);
	                map.put(temp.right,temp);
	            }
	        }
	        
	        visited.add(start);
	        queue.add(start);
	        
	        while(!queue.isEmpty()){
	            int size = queue.size();
	            
	            for(int i=0;i<size;i++){
	                Node node = queue.poll();
	                
	                if(node.left!=null && !visited.contains(node.left)) queue.add(node.left);
	                if(node.right!=null  && !visited.contains(node.right)) queue.add(node.right);
	                if(map.containsKey(node) && !visited.contains(map.get(node)) && map.get(node)!=null) queue.add(map.get(node));
	                
	                visited.add(node);
	            }
	            
	            time++;
	        }
	        
	        return time;
	    }
}
