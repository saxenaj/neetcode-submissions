class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int min = 0;
        int max = Integer.MAX_VALUE;
        int result = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }

            if (max < nums[i]) {
                max = nums[i];
            }

            set.add(nums[i]);
        }

        for (int j = 0; j < max; j++) {
            if(set.add(j)) {
                result= j;
                break;
            }
        }
        return result;
    }
}
