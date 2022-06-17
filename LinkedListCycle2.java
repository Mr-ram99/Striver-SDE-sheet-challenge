import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

        class Node
		{
		    public int data;
		    public Node next;

		    Node(int data)
		    {
		        this.data = data;
		        this.next = null;
		    }
		}

*****************************************************************/

public class Solution 
{
    public static Node firstNode(Node head) 
    {
        //    Write your code here.
        if(head == null || head.next == null);
        Node slow = head;
        Node fast = head;
        Node temp = head;
        int l=0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                do{
                    slow = slow.next;
                    l++;
                }while(slow!=fast);
                break;
            }
        }
        if(l==0) return null;
        while(l-->0) temp = temp.next;
        while(head!=temp){
            head = head.next;
            temp = temp.next;
        }
        return temp;
    }
}