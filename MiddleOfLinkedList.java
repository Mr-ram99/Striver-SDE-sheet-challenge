import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

       class Node 
        { 
        public:
            int data;
            Node next;
            Node(int data) 
            {
              this.data = data;
              this.next = null;
            }
        };

*****************************************************************/

public class Solution {
    public static Node findMiddle(Node head) 
    {
        // Write your code here
        if(head == null || head.next == null) return head;
        Node s = head;
        Node f = head;
        while(f!=null && f.next!=null){
            s = s.next; 
            f = f.next.next;
        }
        return s;
    }
}
