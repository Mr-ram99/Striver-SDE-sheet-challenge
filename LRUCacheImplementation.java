import java.util.*;
class Node{
    int key;
    int val;
    Node prev;
    Node next;
    Node(int k, int v){
        key = k;
        val = v;
    }
}
public class LRUCache
{
    Map<Integer, Node> map = new HashMap<>();
    Node head;
    Node last;
    int capacity;
    LRUCache(int capacity)
    {
        // Write your code here
        this.capacity = capacity;
        head = new Node(0,0);
        last = new Node(0,0);
        head.next = last;
        last.prev = head;
    }

    public int get(int key)
    {
        // Write your code here
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }

    public void put(int key, int value)
    {
        // Write your code here
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            remove(last.prev);
        }
        insert(new Node(key, value));
    }
     public void remove(Node node){
         map.remove(node.key);
         node.prev.next = node.next;
         node.next.prev = node.prev;
     }
    public void insert(Node node){
        map.put(node.key,node);
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
    }
}
 
