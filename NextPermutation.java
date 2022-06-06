class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int j=n-2, i;
        while(j>=0 && arr[j]>=arr[j+1]) j--;
        if(j>=0){
            i=n-1;
            while(i>j && arr[i]<=arr[j])i--;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        j++;
        i=n-1;
        while(j<i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
            i--;
        }
    }
}