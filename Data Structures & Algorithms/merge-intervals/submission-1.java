class Solution {
    public int[][] merge(int[][] intervals) {
     List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
     List<int[]> result = new ArrayList<>();
     list.sort(Comparator.comparingInt(a -> a[0]));

     int newinterval[] = list.get(0);
      result.add(newinterval);
   
     for(int i=0;i<list.size();i++) {
         if(newinterval[1] >=list.get(i)[0]) {
         newinterval[1] = Math.max(list.get(i)[1] , newinterval[1]);
         }

         else{
          newinterval = list.get(i);
          result.add(newinterval);
         }

        }
                
    return result.toArray(new int[0][]);
    }
}
