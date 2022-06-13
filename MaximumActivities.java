import java.util.*;
public class Solution {
    public static int maximumActivities(List<Integer> start, List<Integer> end) {
        //Write your code here
        int n = start.size();
        int [][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=end.get(i);
            arr[i][1]=start.get(i);
        }
        Arrays.sort(arr, (a,b)->a[0]>b[0]?1:a[0]==b[0]?a[1]>b[1]?1:-1:-1);
        int j=0;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i][1]>=arr[j][0]){
                count++;
                j=i;
            }
        }
        return count;
    }
}