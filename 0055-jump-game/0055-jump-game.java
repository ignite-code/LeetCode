class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1 || nums[0] == nums.length){
            return true;
        }
        if(nums[0] == 0){
            return false;
        }
        int target = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            
            if(nums[i]+i >= target){
                target=i;
            }
                
        }
    
        return target==0;
    }
}