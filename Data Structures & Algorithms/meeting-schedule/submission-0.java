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
        if(intervals.size()<=1) {
            return result;
        }
        intervals.sort(Comparator.comparingInt(interval -> interval.start));
        for(int i=0;i<intervals.size();i++) {
            if(result) {
            int endInterval = intervals.get(i).end;
            int j = i+1;
            while(j<intervals.size()) {
                int startInterval = intervals.get(j).start;
                if(endInterval>startInterval) {
                 result = false;
                 break;
                }
                j++;
            }
            }
            else{
                break;
            }

        }
      return result;
    }
}
