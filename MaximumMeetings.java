import java.util.*;
public class Solution {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {        
        //Write your code here
        int n = start.length;
        ArrayList<Meeting> meet=new ArrayList<Meeting>();
        List<Integer> answer=new ArrayList<Integer>();
        for(int i=0;i<start.length;i++){
            meet.add(new Meeting(i+1,start[i],end[i]));
        }
        Collections.sort(meet, new compare());
        answer.add(meet.get(0).pos);
        int limit=meet.get(0).end;
        for(int i=1;i<meet.size();i++){
            if(limit<meet.get(i).start){
                answer.add(meet.get(i).pos);
                limit=meet.get(i).end;
            }
        }
        return answer;
    }
    
}
class Meeting{
    int pos,start,end;
     Meeting(int x,int y,int z){
         pos=x;
         start=y;
         end=z;
     }
}
class compare implements Comparator<Meeting> {
    @Override
    public int compare(Meeting a, Meeting b) {
        return a.end - b.end;
    }
}