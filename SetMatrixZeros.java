import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        boolean f1 = false, f2 = false;
        int n = matrix.length;
        int m = matrix[0].length;
        if(matrix[0][0]==0){
            f1=true;
            f2=true;
        }
        else{
            for(int i=1;i<n;i++){
                if(matrix[i][0]==0){
                    f1 = true;
                    break;
                }
            }
            for(int i=1;i<m;i++){
                if(matrix[0][i]==0){
                    f2 = true;
                    break;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(f1){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
        if(f2){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        
        
    }

}