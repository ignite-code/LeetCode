import java.util.Arrays;
class Solution {
    public int findDuplicate(int[] nums) {
        int val=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] == nums[i]){
                val = nums[i];
                break;
            }
        }
        return val;
    }
}