package amazon;

public class DeleteMafterNnodesLL {
	static void linkdelete(Node head, int M, int N)
    {
        // your code here
        
        if(head== null) return;
        
        int m = M;
        int n = N;
        
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        while(curr!=null){
            while(m-- > 0 && curr!=null) {
            prev = curr;
            curr=curr.next;
        }
        
        while(curr!=null && n-->0) {
            curr=curr.next;
        }
        
        prev.next = curr;
        m = M;
        n = N;
        }
        
        
    }
}
