import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode cur = new LinkedListNode(-1);
        LinkedListNode dummyHead = cur;
        LinkedListNode temp;
        if(first == null) return second;
        if(second == null) return first;
        while(first != null && second !=null){
            if(first.data <= second.data){
                temp = new LinkedListNode(first.data);
                first = first.next;
            }
            else{
                temp = new LinkedListNode(second.data);
                second = second.next;
            }
            cur.next = temp;
            cur = cur.next;
        }
       while(first != null){
            temp = new LinkedListNode(first.data);
            first = first.next;
            cur.next = temp;
            cur = cur.next;
        }
        while(second != null){
            temp = new LinkedListNode(second.data);
            second = second.next;
            cur.next = temp;
            cur = cur.next;
        }
        return dummyHead.next;
	}
}
