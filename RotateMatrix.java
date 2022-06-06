import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        // Write your code here.
        int startRow = 0, startCol =0, lastRow = n-1, lastCol = m-1, prev, cur;
        while(startRow<lastRow && startCol<lastCol){
            prev = mat.get(startRow+1).get(startCol);
            for(int i=startCol;i<=lastCol;i++){
                cur = mat.get(startRow).get(i);
                mat.get(startRow).set(i, prev);
                prev = cur;
            }
            startRow++;
            for(int i=startRow;i<=lastRow;i++){
                cur = mat.get(i).get(lastCol);
                mat.get(i).set(lastCol, prev);
                prev = cur;
            }
            lastCol--;
            for(int i=lastCol;i>=startCol;i--){
                cur = mat.get(lastRow).get(i);
                mat.get(lastRow).set(i, prev);
                prev = cur;
            }
            lastRow--;
            for(int i=lastRow;i>=startRow;i--){
                cur = mat.get(i).get(startCol);
                mat.get(i).set(startCol, prev);
                prev = cur;
            }
            startCol++;
        }
    }
}
