class Solution {
    public int subarraySum(int[] nums, int k) {
       Map<Integer,Integer> map = new HashMap<>();
        int prefixSum=0;
        int result=0;

        map.put(0,1);

        for (int i = 0; i < nums.length; i++) {
            prefixSum=prefixSum+nums[i];
            if(map.containsKey(prefixSum-k)) {
                result=result+map.get(prefixSum-k);
            }

            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);

        }

    return result;
        
    }
}