class Solution {
    public int[][] merge(int[][] intervals) {

        List<int []> mergedIntervals = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        System.out.println(Arrays.deepToString(intervals));


        for (int i = 0; i < intervals.length; i++) {
            if(mergedIntervals.isEmpty() || intervals[i][0] > mergedIntervals.get(mergedIntervals.size() - 1)[1]) {
                mergedIntervals.add(intervals[i]);
            }
            else {
                mergedIntervals.get(mergedIntervals.size() - 1)[1] = Math.max(mergedIntervals.get(mergedIntervals.size() - 1)[1], intervals[i][1]);
            }
        }
        //System.out.println(Arrays.deepToString(mergedIntervals.toArray()));


        return mergedIntervals.toArray(new int [mergedIntervals.size()][]);
        
    }
}
