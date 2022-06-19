public class Solution {
    public static int search(int arr[], int key) {
        // Write your code here.
        int i=0, j=arr.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid] == key) return mid;
            else if(arr[i]<=arr[mid]){
                if(key>=arr[i] && key<=arr[mid]) j=mid-1;
                else i=mid+1;
            }
            else {
                if(key<=arr[j] && key>=arr[mid]) i=mid+1;
                else j=mid-1;
            }
        }
        return -1;
    }
}