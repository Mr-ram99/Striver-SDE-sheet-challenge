import java.util.* ;
import java.io.*; 
/*************************************************************

    Following is the LinkedListNode class structure

    class LinkedListNode<T> {
	    T data;
	    LinkedListNode<T> next;
	    LinkedListNode<T> random;

	    public LinkedListNode(T data) {
		    this.data = data;
	    }
    }

*************************************************************/

public class Solution {
	public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
		// Write your code here.
        HashMap<LinkedListNode, LinkedListNode> map= new HashMap<>();
        LinkedListNode temp = head;
        while(temp != null){
            LinkedListNode node = new LinkedListNode(temp.data);
            map.put(temp, node);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            LinkedListNode node = map.get(temp);
            node.next = map.get(temp.next);
            node.random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
	}
}


