import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        return mergesort(arr, 0, n-1);
    }
    public static long mergesort(long [] arr, int s, int e){
        if(s<e){
            int mid = s + (e-s)/2;
            long count=0;
            count += mergesort(arr,s,mid);
            count += mergesort(arr,mid+1,e);
            count += merge(arr,s,mid,e);
            return count;
        }
        return 0;
    }
    public static long merge(long [] arr, int s, int mid, int e){
        long [] left = new long[mid-s+1];
        long [] right = new long[e-mid];
        int j=0,i=0,k;
        long count=0;
        for(i=s;i<=mid;i++){
            left[j++]=arr[i];
        }
        j=0;
        for(i=mid+1;i<=e;i++){
            right[j++]=arr[i];
        }
        i=0;j=0;k=s;
        int n1 = left.length, n2 = right.length;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++] = left[i++];
            }
            else{
                count += n1-i;
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
                arr[k++] = left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
        return count;
    }
    
}