import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/


public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
        int sum=0, carry=0;
        LinkedListNode cur = new LinkedListNode(-1);
        LinkedListNode dummy = cur;
        LinkedListNode temp;
        while(head1!=null && head2!=null){
            sum = head1.data + head2.data + carry;
            carry = sum/10;
            sum = sum%10;
            temp = new LinkedListNode(sum);
            cur.next = temp;
            cur = cur.next;
            head1 = head1.next;
            head2 = head2.next;
        }
        while(head1!=null){
            sum = head1.data + carry;
            carry = sum/10;
            sum = sum%10;
            temp = new LinkedListNode(sum);
            cur.next = temp;
            cur = cur.next;
            head1 = head1.next;
        }
        while(head2!=null){
            sum = head2.data + carry;
            carry = sum/10;
            sum = sum%10;
            temp = new LinkedListNode(sum);
            cur.next = temp;
            cur = cur.next;
            head2 = head2.next;
        }
        if(carry!=0){
            temp = new LinkedListNode(carry);
            cur.next = temp;
        }
        return dummy.next;
    }
}











