import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

	    // Write your code here.
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i<n ; i++)
       {
           int left = i+1 ;
           int right = n-1;
           while(left<right)
           {
               if(arr[left]+arr[right]+arr[i] == K)
               {
                    list.add(new ArrayList<>(Arrays.asList(arr[left], arr[right], arr[i])));
                   int x = arr[left] ;
                   int y = arr[right] ;
                   while(left<right && arr[left]==x){
                       left++ ;
                   }
                      while(left<right && arr[right]==y){
                       right-- ;
                   }
               }
               else if(arr[left]+arr[right]+arr[i] < K){
                   left++;
               }
               else{
                   right--;
               }
           }
           //skipping same ith element
            while(i+1<n && arr[i]==arr[i+1]){
               i++ ;
           }
       }
        return list;
	}
}
