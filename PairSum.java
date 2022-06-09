import java.util.* ;
import java.io.*; 
public class Solution{
    public static int[][] pairSum(int[] arr, int s) {
        // Write your code here.
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            int x = e.getKey();
            int f1 = e.getValue();
            int req = s-x;
            if(map.containsKey(s-x) && !set.contains(s-x)){
                int f2=map.get(s-x),f=0;
                if(x!=s-x){
                    f = f1*f2;
                }
                else{
                    f = (f1*(f1-1))/2;
                }
                while(f-->0){
                    list.add(new ArrayList<>(Arrays.asList(Math.min(x,s-x), Math.max(x,s-x))));
                }
                
            }
            set.add(x);
        }
        int [][] res = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            res[i][0] = list.get(i).get(0);
            res[i][1] = list.get(i).get(1);
        }
        Arrays.sort(res, (a,b)->a[0]>b[0]?1:a[0]==b[0]?a[1]>b[1]?1:-1:-1);
        return res;
    }
}