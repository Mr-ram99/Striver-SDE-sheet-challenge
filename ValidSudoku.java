public class Solution {

	public static boolean isItSudoku(int matrix[][]) {

		// Write your code here.
        return validate(0,0,matrix);
	}
    public static boolean validate(int i, int j, int [][] mat){
        int n = mat.length, m=mat[0].length;
        if(j==m){
            i++;
            j=0;
        }
        if(i==n){
            return true;
        }
        if(mat[i][j]!=0){
            return validate(i,j+1,mat);
        }
        for(int num=1;num<=9;num++){
            if(isSafe(i,j,mat,num)){
                mat[i][j]=num;
                if(validate(i,j+1,mat)) return true;
                mat[i][j]=0;
            }
        }
            return false;
    }
    public static boolean isSafe(int row, int col, int [][] mat, int num){
        int n = mat.length, m=mat[0].length;
        for(int i=0;i<n;i++){
            if(i!=row && mat[i][col]==num) return false;
        }
        for(int i=0;i<m;i++){
            if(i!=col && mat[row][i]==num) return false;
        }
        int rs = (row/3)*3;
        int cs = (col/3)*3;
        for(int i=rs;i<rs+3;i++){
            for(int j=cs;j<cs+3;j++){
                if(i==row && j==col)continue;
                if(mat[i][j]==num)return false;
            }
        }
        return true;
    }
}
