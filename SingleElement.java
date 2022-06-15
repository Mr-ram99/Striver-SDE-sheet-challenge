import java.util.ArrayList;

public class Solution 
{
    public static int uniqueElement(ArrayList<Integer> arr) 
    {
        //    Write your code here.
        int xor = 0;
        for(int i=0;i<arr.size();i++){
            xor = (xor^arr.get(i));
        }
        return xor;
    }
}