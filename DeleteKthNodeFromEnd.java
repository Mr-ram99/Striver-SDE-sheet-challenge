import java.util.* ;
import java.io.*; 
/****************************************************************
	
	Following is the structure of the Singly Linked List.
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int k) {
		// Write your code here.
        if(head == null || k==0) return head;
        LinkedListNode prev = null;
        LinkedListNode cur = head;
        int l=0;
        while(cur!=null) {
            l++;
            cur = cur.next;
        }
        cur=head;
        int d = l-k;
        while(d-->0){
            prev = cur;
            cur = cur.next;
        }
        if(prev == null) {
            head = head.next;
        }
        else{
            prev.next = cur.next;
        }
        return  head;
	}
}
