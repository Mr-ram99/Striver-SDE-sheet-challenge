import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        // Write your code here.
        return mergesort(arr, 0, arr.size()-1);
    }
    
     public static int mergesort(ArrayList<Integer> arr, int s, int e){
        if(s<e){
            int mid = s + (e-s)/2;
            int count=0;
            count += mergesort(arr,s,mid);
            count += mergesort(arr,mid+1,e);
            count += merge(arr,s,mid,e);
            return count;
        }
        return 0;
    }
    public static int merge(ArrayList<Integer> arr, int s, int mid, int e){
        int [] left = new int[mid-s+1];
        int [] right = new int[e-mid];
        int j=0,i=0,k;
        int count=0;
        for(i=s;i<=mid;i++){
            left[j++]=arr.get(i);
        }
        j=0;
        for(i=mid+1;i<=e;i++){
            right[j++]=arr.get(i);
        }
        
        int n1 = left.length, n2 = right.length;
        j=0;
        for(i=0;i<n1;i++){
            while(j<n2 && left[i]>right[j]*2) j++;
            count += j;
        }
        
        i=0;j=0;k=s;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr.set(k++,left[i++]);
            }
            else{
                arr.set(k++,right[j++]);
            }
        }
        while(i<n1){
                arr.set(k++, left[i++]);
        }
        while(j<n2){
            arr.set(k++,right[j++]);
        }
        return count;
    }
}