public class Solution {
	public static String graphColoring(int[][] mat, int m) {
		// Write your code here
        int n = mat.length;
        int [] color = new int[n];
        return solve(0,color,mat,n,m)==true?"YES":"NO";
	}
    public static boolean solve(int node, int[] color, int[][] mat, int n, int m){
        if(node == n) return true;
        for(int i=1;i<=m;i++){
            if(isPossible(node,color,n,mat,i)){
                color[node]=i;
                if(solve(node+1, color, mat, n, m))return true;
            }
            color[node] = 0;
        }
        return false;
    }
    public static boolean isPossible(int node, int[] color, int n, int [][] mat, int col){
        for(int j=0;j<n;j++){
            if(j!=node && mat[node][j]==1 && color[j]==col)return false;
        }
        return true;
    }
}
