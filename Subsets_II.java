import java.util.*;
public class Solution {
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        // Write your code here..
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        ArrayList<Integer> li = new ArrayList<>();
        subsets(0,arr,list,li);
        Collections.sort(list, new ListComparator<>());
        return list;
    }
    public static void subsets(int ind, int[] arr, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> li){
        if(ind == arr.length){
            list.add(new ArrayList<>(li));
            return ;
        }
        li.add(arr[ind]);     
        subsets(ind+1, arr, list, li);
        li.remove(li.size()-1);
        while(ind+1<arr.length && arr[ind]==arr[ind+1])ind++;
        subsets(ind+1, arr, list, li);
    }

}
class ListComparator<T extends Comparable<T>> implements Comparator<List<T>> {

  @Override
  public int compare(List<T> o1, List<T> o2) {
    for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
      int c = o1.get(i).compareTo(o2.get(i));
      if (c != 0) {
        return c;
      }
    }
    return Integer.compare(o1.size(), o2.size());
  }

}