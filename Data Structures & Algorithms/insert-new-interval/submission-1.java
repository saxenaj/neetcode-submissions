class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int []> sortedIntervals = new ArrayList<>();
        List<int []> mergedIntervals = new ArrayList<>();
        boolean visited =false;

         if(intervals.length == 0){
            mergedIntervals.add(newInterval);
            return mergedIntervals.toArray(new int [mergedIntervals.size()][]);
        }

        for (int i = 0; i < intervals.length; i++) {
            if(intervals[i][0] >= newInterval[0] && !visited) {
                sortedIntervals.add(newInterval);
                visited = true;
            }
            sortedIntervals.add(intervals[i]);

        }

        if (!visited) {
    sortedIntervals.add(newInterval);
}

        //System.out.println(Arrays.deepToString(sortedIntervals.toArray()));


        for (int i = 0; i < sortedIntervals.size(); i++) {

            if(mergedIntervals.isEmpty() || sortedIntervals.get(i)[0] > mergedIntervals.get(mergedIntervals.size() - 1)[1]) {
                mergedIntervals.add(sortedIntervals.get(i));
            }
            else {
                mergedIntervals.get(mergedIntervals.size() - 1)[1] = Math.max(mergedIntervals.get(mergedIntervals.size() - 1)[1], sortedIntervals.get(i)[1]);
            }


        }
        //System.out.println(Arrays.deepToString(mergedIntervals.toArray()));


      return mergedIntervals.toArray(new int [mergedIntervals.size()][]);
        
    }
}
