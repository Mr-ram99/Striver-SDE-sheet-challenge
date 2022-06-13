import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		// Write your code here!
        LinkedListNode mid = findMid(head);
        LinkedListNode head2 = reverse(mid);
        while(head!=null && head2!=null){
            if(!head.data.equals(head2.data)) return false;
            head = head.next;
            head2 = head2.next;
        }
        return true;
	}
    public static LinkedListNode findMid(LinkedListNode head){
        if(head == null || head.next == null) return null;
        LinkedListNode prev = null;
        LinkedListNode slow = head;
        LinkedListNode fast = head;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }
    public static LinkedListNode reverse(LinkedListNode head){
        if(head == null || head.next == null) return head;
        LinkedListNode prev = null;
        LinkedListNode cur = head;
        LinkedListNode nxt = cur.next;
        while(nxt!=null){
            cur.next = prev;
            prev = cur;
            cur = nxt;
            nxt = nxt.next;
        }
        cur.next = prev;
        return cur;
    }
}



