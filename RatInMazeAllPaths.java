import java.util.*;
public class Solution {
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(maze[0][0]==0 || maze[n-1][n-1]==0) return list;
        boolean [][] path = new boolean[n][n]; 
        path[0][0]=true;
        allpaths(0,0,maze,path, list);
        return list;
    }
    public static void allpaths(int i, int j, int[][]maze, boolean [][] path, ArrayList<ArrayList<Integer>> list){
        int n = maze.length;
        if(i==n-1 && j==n-1){
            ArrayList<Integer> li = new ArrayList<>();
            for(int k=0;k<n;k++){
                for(int l=0;l<n;l++){
                    if(path[k][l])li.add(1);
                    else li.add(0);
                }
            }
            list.add(new ArrayList<>(li));
            return ;
        }
        if(i+1<n && maze[i+1][j]==1 && path[i+1][j]==false){
            path[i+1][j] = true;
            allpaths(i+1, j, maze, path, list);
            path[i+1][j] = false;
        }
        if(j+1<n && maze[i][j+1]==1 && path[i][j+1]==false){
            path[i][j+1] = true;
            allpaths(i, j+1, maze, path, list);
            path[i][j+1] = false;
        }
        if(i-1>=0 && maze[i-1][j]==1 && path[i-1][j]==false){
            path[i-1][j] = true;
            allpaths(i-1, j, maze, path, list);
            path[i-1][j] = false;
        }
        if(j-1>=0 && maze[i][j-1]==1 && path[i][j-1]==false){
            path[i][j-1] = true;
            allpaths(i, j-1, maze, path, list);
            path[i][j-1] = false;
        }
    }
}