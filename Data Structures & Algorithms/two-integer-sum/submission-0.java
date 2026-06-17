class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] nums_target = new int[nums.length];
        int [] result = new int[2];
        for(int i=0;i<nums.length;i++) {
               nums_target[i] = target - nums[i];
        }

        for(int j=0;j<nums.length;j++){
            if(target == (nums[j] + nums_target[j])) {
                for(int z=j+1;z<nums.length;z++) {
                    if(nums[j] == nums_target[z] && nums[z] == nums_target[j]) {
                        result[0] = j;
                        result[1] = z;
                        break;
                    }

                }
            }
        }
     return result;

        
    }
}
