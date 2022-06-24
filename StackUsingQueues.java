import java.util.*;
public class Stack {

    // Define the data members.
    Queue<Integer> q1;
    Queue<Integer> q2;

    public Stack() {
        // Implement the Constructor.
        q1 =  new LinkedList<>();
        q2 = new LinkedList<>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        // Implement the getSize() function.
        if(q1.isEmpty()) return q2.size();
        return q1.size();
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function.
        return q1.isEmpty() && q2.isEmpty();
    }

    public void push(int element) {
        // Implement the push(element) function.
        if(q1.isEmpty()){
            q1.add(element);
            while(!q2.isEmpty()) q1.add(q2.remove());
        }
        else{
            q2.add(element);
            while(!q1.isEmpty()) q2.add(q1.remove());
        }
        
    }

    public int pop() {
        // Implement the pop() function.
        if(q1.isEmpty() && q2.isEmpty()) return -1;
        if(q1.isEmpty()) return q2.remove();
        return q1.remove();
    }

    public int top() {
        // Implement the top() function.
        if(q1.isEmpty() && q2.isEmpty()) return -1;
        if(q1.isEmpty()) return q2.peek();
        return q1.peek();
    }
}