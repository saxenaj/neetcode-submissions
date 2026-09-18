/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        boolean result=true;
        int i=0;
        if(intervals.size()<=1) {
            return result;
        }
        intervals.sort(Comparator.comparingInt(interval -> interval.start));
        while(i<intervals.size()){
        if(i+1<intervals.size() && intervals.get(i).end > intervals.get(i+1).start) {
           result=false;
           break;
        }
      i++;
        }
      return result;
    }
}
