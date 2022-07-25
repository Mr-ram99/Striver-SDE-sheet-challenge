import java.util.*;
class Node{
    Node [] links = new Node[26];
    boolean flag = false;
    
    boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }
    Node get(char ch){
        return links[ch-'a'];
    }
    void put(char ch, Node node){
        links[ch-'a']=node;
    }
    void setEnd(){
        flag=true;
    }
    boolean isEnd(){
        return flag;
    }
}

class Trie{
    Node root;
    Trie(){
        root = new Node();
    }
    void insert(String word){
        Node node = root;
        for(int i=0;i<word.length();i++){
            char ch =word.charAt(i);
            if(!node.containsKey(ch)){
                node.put(ch, new Node());
            }
            node = node.get(ch);
        }
        node.setEnd();
    }
    boolean allPrefixExist(String word){
        Node node = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(node.containsKey(ch)){
                node = node.get(ch);
                if(!node.isEnd()) return false;
            }
            else return false;
        }
        return true;
    }
}
class Solution {

  public static String completeString(int n, String[] a) {
    // Write your code here.
     Trie trie = new Trie();
      for(int i=0;i<n;i++){
          trie.insert(a[i]);
      }
      String ans="";
      for(int i=0;i<n;i++){
          if(trie.allPrefixExist(a[i])){
              if(a[i].length()>ans.length()) ans=a[i];
              else if(a[i].length()==ans.length()){
                  ans = a[i].compareTo(ans)<0?a[i]:ans;
              }
          }
      }
      return ans.equals("")?"None":ans;
  }
}