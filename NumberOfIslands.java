public class Solution 
{
    public static int getTotalIslands(int[][] mat) 
	{
        //Your code goes here
        int n = mat.length;
        int m = mat[0].length;
        int count=0;
        boolean [][] visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1 && !visited[i][j]){
                    count++;
                    visit(i,j,mat,visited);
                }
            }
        }
        return count;
    }
    public static void visit(int i, int j, int[][] mat, boolean [][] visited){
        int n = mat.length;
        int m = mat[0].length;
        visited[i][j]=true;
        if(i+1<n && mat[i+1][j]==1 && !visited[i+1][j]){
            visit(i+1,j,mat,visited);
        }
        if(i-1>=0 && mat[i-1][j]==1 && !visited[i-1][j]){
            visit(i-1,j,mat,visited);
        }
        if(j+1<m && mat[i][j+1]==1 && !visited[i][j+1]){
            visit(i,j+1,mat,visited);
        }
        if(j-1>=0 && mat[i][j-1]==1 && !visited[i][j-1]){
            visit(i,j-1,mat,visited);
        }
        if(i+1<n && j-1>=0 && mat[i+1][j-1]==1 && !visited[i+1][j-1]){
            visit(i+1,j-1,mat,visited);
        }
        if(i+1<n && j+1<m && mat[i+1][j+1]==1 && !visited[i+1][j+1]){
            visit(i+1,j+1,mat,visited);
        }
        if(i-1>=0 && j-1>=0 && mat[i-1][j-1]==1 && !visited[i-1][j-1]){
            visit(i-1,j-1,mat,visited);
        }
        if(i-1>=0 && j+1<m && mat[i-1][j+1]==1 && !visited[i-1][j+1]){
            visit(i-1,j+1,mat,visited);
        }
    }
}



