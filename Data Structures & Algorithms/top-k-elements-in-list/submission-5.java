class Solution {
    public int[] topKFrequent(int[] nums, int k) {

       
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[k];

        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                count++;
                map.put(nums[i], count);
            }
            else {
                map.put(nums[i], 1);
            }
        }

         PriorityQueue<Integer> queue = new PriorityQueue<>(
         (a,b) -> Integer.compare(map.get(a),map.get(b))
         );

        map.forEach((key, value) -> {
        if(queue.size() < k) {
            queue.offer(key);
        }
        else {
        int peekvalue = queue.peek();
        if(map.get(peekvalue) < value) {
          queue.poll();
          queue.offer(key);
        }
        }
        }
        );

       for(int q=0;q<k;q++) {
        result[q] = queue.poll();
       }
        
        return result;
        
    }
}
