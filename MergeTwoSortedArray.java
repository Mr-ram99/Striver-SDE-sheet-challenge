import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int i = m+n-1;
        int j = m-1;
        int k = n-1;
        while(j>=0 && k>=0){
            if(arr1[j]>=arr2[k]){
                arr1[i] = arr1[j];
                i--;j--;
            }
            else{
                arr1[i] = arr2[k];
                i--;k--;
            }
        }
        while(j>=0){
            arr1[i] = arr1[j];
            i--;j--;
        }
        while(k>=0){
            arr1[i] = arr2[k];
            i--;k--;
        }
        return arr1;
    }
}
