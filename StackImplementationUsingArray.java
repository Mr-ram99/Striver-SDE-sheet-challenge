
public class Stack {
    int [] arr;
    int size;
    Stack(int capacity){
        arr = new int[capacity];
        size=0;
    }
    void push(int num) {
        // Write your code here.
        if(size<arr.length){
            arr[size]=num;
            size++;
        }
    }
    int pop() {
        // Write your code here.
        if(size>0){
            size--;
            return arr[size];
        }
        return -1;
    }
    int top() {
        // Write your code here.
        if(size>0){
            return arr[size-1];
        }
        return -1;
    }
    int isEmpty() {
        // Write your code here.
        return size==0?1:0;
    }
    int isFull() {
        // Write your code here.
        return size==arr.length?1:0;
    }
}
