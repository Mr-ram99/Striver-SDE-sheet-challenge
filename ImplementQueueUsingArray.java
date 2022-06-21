public class Queue {
    int [] arr;
    int front, rear;
    Queue() {
        // Implement the Constructor
        arr = new int[10000];
        front=0;
        rear=0;
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        // Implement the isEmpty() function
        if(front == rear) return true;
        return false;
    }

    void enqueue(int data) {
        // Implement the enqueue() function
        arr[rear++] = data;
    }

    int dequeue() {
        // Implement the dequeue() function
        if(isEmpty()) return -1;
        return arr[front++];
    }

    int front() {
        // Implement the front() function
        return isEmpty()?-1:arr[front];
    }

}
