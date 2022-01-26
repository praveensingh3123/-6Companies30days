package amazon;
import java.util.*;

public class SerializeAndDeserializeABTree {
	public void serialize(Node root, ArrayList<Integer> arr) 
	{
	    if(root==null){
	        arr.add(-1);
	        return;
	    }
	    arr.add(root.data);
	    serialize(root.left,arr);
	    serialize(root.right,arr);
	}
	
	int index=0;
    public Node deSerialize(ArrayList<Integer> arr)
    {
        if(index==arr.size())
         return null;
         int val=arr.get(index);
         index++;
         if(val==-1) return null;
         Node root=new Node(val);
         root.left= deSerialize(arr);
         root.right=deSerialize(arr);
         
         return root;
    }
}
