import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        Arrays.sort(intervals, (a,b)->a.start>b.start?1:a.start == b.start?a.finish>b.finish?1:-1:-1);
        List<Interval> list = new ArrayList<>();
        int s = intervals[0].start;
        int e = intervals[0].finish;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i].start<=e){
                e = Math.max(e, intervals[i].finish);
            }
            else {
                Interval a = new Interval(s,e);
                list.add(a);
                s = intervals[i].start;
                e = intervals[i].finish;
            }
        }
        Interval a = new Interval(s,e);
        list.add(a);
        return list;
    }
}
