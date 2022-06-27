public class Solution {
    public static double median(int[] a, int[] b) {
    	// Write your code here.
        int n1 = a.length, n2= b.length;
        int n = n1 + n2;
        int i=n1-1, j=n2-1, mid;
        if(n%2==0){
            mid = (n-1)/2;
            while(i>=0 && j>=0 && mid>0){
                if(a[i]>b[j]) i--;
                else j--;
                mid--;
            }
            while(i>=0 && mid>0){
                i--;
                mid--;
            }
            while(j>=0 && mid>0){
                j--;
                mid--;
            }
            double num1 = 0.0, num2 = 0.0;
            if(i>=0 && j>=0){
                if(a[i]>b[j]){
                    num1 = a[i];
                    i--;
                }
                else{
                    num1 = b[j];
                    j--;
                }
                if(i>=0 && j>=0){
                    num2 = Math.max(a[i],b[j]);
                }
                else{
                    if(i>=0){
                        num2 = a[i];
                    }
                    else{
                        num2 = b[j];
                    }
                }
            }
            else{
                if(i>=0){
                    num1 = a[i];
                    num2 = a[i-1];
                }
                else{
                    num1 = b[j];
                    num2 = b[j-1];
                }
            }
            return (double)(num1+num2)/2.0;
        }
        else{
            mid = n/2;
            while(i>=0 && j>=0 && mid>0){
                if(a[i]>b[j]) i--;
                else j--;
                mid--;
            }
            while(i>=0 && mid>0){
                i--;
                mid--;
            }
            while(j>=0 && mid>0){
                j--;
                mid--;
            }
            if(i>=0 && j>=0){
                return Math.max(a[i],b[j]);
            }
            if(i>=0) return a[i];
            return b[j];
        }
    }
}