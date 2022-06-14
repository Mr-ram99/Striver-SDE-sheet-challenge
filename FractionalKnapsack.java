/****************************************************************

    Following is the class structure of the Pair class:

        class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
        
*****************************************************************/

import java.util.*;
public class Solution {
    public static double maximumValue(Pair[] items, int n, int w) {
            // Write your code here.
    	    // ITEMS contains {weight, value} pairs.
        Arrays.sort(items, (a,b)->((double)b.value/(double)b.weight) - ((double)a.value/(double)a.weight)>0.0?1:-1);
        int i=0;
        double profit=0.0;
        while(i<n && w>0){
            if(items[i].weight<=w){
                profit += (double)items[i].value;
                w -= items[i].weight;
                i++;
            }
            else{
                profit += ((double)items[i].value/(double)items[i].weight)*(double)(w);
                break;
            }
        }
        return profit;
    }
}
