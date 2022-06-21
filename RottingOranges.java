import java.util.*;
public class Solution {
	public static int minTimeToRot(int[][] grid, int n, int m) {
		// Write your code here.
        Queue<Pair> q = new LinkedList<>();
        int [][] dir = {{0,1},{1,0},{-1,0},{0,-1}};
        int fresh = 0, time=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new Pair(i,j));
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        while(!q.isEmpty()){
            int s = q.size();
            while(s-->0){
                Pair p = q.poll();
                for(int [] a: dir){
                    int x = p.i+a[0];
                    int y = p.j+a[1];
                    if(x>=0 && x<n && y>=0 && y<m && grid[x][y]==1){
                        q.offer(new Pair(x,y));
                        grid[x][y]=2;
                        fresh--;
                    }
                }
            }
            time++;
            if(fresh==0)break;
        }
        return fresh==0?time:-1;
	}
}
class Pair{
    int i;
    int j;
    Pair(int i, int j){
        this.i = i;
        this.j = j;
    }
}