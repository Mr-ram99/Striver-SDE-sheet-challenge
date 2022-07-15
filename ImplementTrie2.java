class Node{
    Node links[] = new Node[26];
    int endwith=0;
    int countPrefix=0;
    boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }
    Node get(char ch){
        return links[ch-'a'];
    }
    void put(char ch, Node node){
        links[ch-'a'] = new Node();
    }
    void increaseEnd(){
        endwith++;
    }
    void increasePrefix(){
        countPrefix++;
    }
    void deleteEnd(){
        endwith--;
    }
    void reducePrefix(){
        countPrefix--;
    }
    int getEnd(){
        return endwith;
    }
    int getPrefix(){
        return countPrefix;
    }
}

public class Trie {
    Node root;
    public Trie() {
        // Write your code here.
        root = new Node();
    }

    public void insert(String word) {
        // Write your code here.
        int n = word.length();
        Node node = root;
        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
            if(!node.containsKey(ch)){
                node.put(ch, new Node());
            }
            node = node.get(ch);
            node.increasePrefix();
        }
        node.increaseEnd();
    }

    public int countWordsEqualTo(String word) {
        // Write your code here.
        int n = word.length();
        Node node = root;
        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
            if(!node.containsKey(ch)){
                return 0;
            }
            node = node.get(ch);
        }
        return node.getEnd();
    }

    public int countWordsStartingWith(String word) {
        // Write your code here.
        int n = word.length();
        Node node = root;
        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
            if(!node.containsKey(ch)){
                return 0;
            }
            node = node.get(ch);
        }
        return node.getPrefix();
    }

    public void erase(String word) {
        // Write your code here.
            int n = word.length();
            Node node = root;
            for(int i=0;i<n;i++){
                char ch = word.charAt(i);
                node = node.get(ch);
                node.reducePrefix();
            }
            node.deleteEnd();
    }

}
