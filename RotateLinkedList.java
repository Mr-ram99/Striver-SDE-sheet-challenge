import java.util.* ;
import java.io.*; 
/***********************************************
    Following is the class structure of the Node class:

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

************************************************/

public class Solution {
    public static Node rotate(Node head, int k) {
        // Write your code here.
        int l=0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            l++;
        }
        k = k%l;
        k = l-k;
        if(k==0) return head;
        temp = head;
        while(k-->1)temp = temp.next;
        Node newHead= temp.next;
        temp.next = null;
        temp = newHead;
        if(temp==null) return head;
        while(temp.next!=null)temp = temp.next;
        temp.next = head;
        return newHead;
    }
}