public class Solution
{
    public static int[][] floodFill(int[][] image, int x, int y, int newColor)
    {
        // Write your code here
        int oldColor = image[x][y];
        if(oldColor == newColor) return image;
        floodfill(x,y,image,oldColor,newColor);
        return image;
    }
    public static void floodfill(int x, int y, int [][] image, int oldColor, int newColor){
        int n=image.length;
        int m=image[0].length;
        image[x][y]=newColor;
        if(x+1<n && image[x+1][y]==oldColor){
            floodfill(x+1,y,image,oldColor,newColor);
        }
        if(x-1>=0 && image[x-1][y]==oldColor){
            floodfill(x-1,y,image,oldColor,newColor);
        }
        if(y+1<m && image[x][y+1]==oldColor){
            floodfill(x,y+1,image,oldColor,newColor);
        }
        if(y-1>=0 && image[x][y-1]==oldColor){
            floodfill(x,y-1,image,oldColor,newColor);
        }
    }
}

