import java.util.* ;
import java.io.*; 
/************************************
	 
	 //Following is the class structure of the LinkedListNode class:
	 
	  class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;
		
		public LinkedListNode(T data) {
			this.data = data;
			this.next = null;
		}
	}

*****************************************/
public class Solution {

	public static int findIntersection(LinkedListNode<Integer> firstHead, LinkedListNode<Integer> secondHead) {
        int l1=0, l2=0;
        LinkedListNode temp=  firstHead;
        while(temp!=null){
            l1++;
            temp = temp.next;
        }
		temp = secondHead;
        while(temp!=null){
            l2++;
            temp = temp.next;
        }
        while(l2<l1){
            firstHead = firstHead.next;
            l1--;
        }
        while(l2>l1){
            secondHead = secondHead.next;
            l2--;
        }
        while(firstHead!=null && secondHead!=null){
            if(firstHead == secondHead) return firstHead.data;
            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }
        return -1;
	}
}




