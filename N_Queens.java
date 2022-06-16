import java.util.*;
public class Solution {
    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        boolean [][] mat= new boolean[n][n];
        solve(0,n,list,mat);
        return list;
    }
    public static void solve(int row, int n, ArrayList<ArrayList<Integer>> list, boolean [][] mat){
        if(row==n){
            List<Integer> li = new ArrayList<>();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][j])
                        li.add(1);
                    else
                        li.add(0);
                }
            }
            list.add(new ArrayList(li));
            return ;
        }
        for(int col=0;col<n;col++){
            if(check(row,col,mat)){
                mat[row][col]=true;
                solve(row+1,n,list,mat);
                mat[row][col]=false;
            }
        }
    }
    public static boolean check(int r, int c, boolean[][]mat){
        int n = mat.length;
        for(int i=r;i>=0;i--){
            if(mat[i][c])return false;
        }
        for(int i=r,j=c;i>=0 && j>=0;i--,j--){
            if(mat[i][j])return false;
        }
        for(int i=r,j=c;i>=0 && j<n;i--,j++){
            if(mat[i][j])return false;
        }
        return true;
    }
}