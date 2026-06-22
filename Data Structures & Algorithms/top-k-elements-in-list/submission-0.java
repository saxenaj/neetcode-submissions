class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> tempMap = new HashMap();
        int[] result = new int[k];
        for(int num : nums) {
            if(tempMap.containsKey(num)) {
             int val = tempMap.get(num);
             val++;
             tempMap.put(num,val);
            }
            else {
            tempMap.put(num,1);
            }
        }
        System.out.println("Map--->" + tempMap);
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(tempMap.entrySet());
        list.sort(Map.Entry.comparingByValue());


        System.out.println("List-->>" + list);
        Collections.reverse(list);


         for(int i=0;i<k;i++) {
             result[i] = list.get(i).getKey();
         }

        return result;
    }
}
