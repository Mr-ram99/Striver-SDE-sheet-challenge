public class Solution {
    public static int ninjaAndLadoos(int row1[], int row2[], int m, int n, int k) {
        // Write your code here.
        int i=0, j=0, count=0, pick;
        while(i<m && j<n){
            if(row1[i]<row2[j]){
                pick = row1[i];
                i++;
            }
            else{
                pick = row2[j];
                j++;
            }
            count++;
            if(count == k){
                return pick;
            }
        }
        while(i<m){
            count++;
            if(count==k) return row1[i];
            i++;
        }
         while(j<n){
            count++;
            if(count==k) return row2[j];
            j++;
        }
        return 0;
    }
}
