class Solution {
    public int jump(int[] nums) {
        
        int jumps=0;
        int target =0;
        int end=0;
        for(int i=0;i<nums.length-1;i++){
            target = Math.max(target, i+nums[i]);
            if(i == end){
                jumps++;
                end = target;
            }
        }
        return jumps;
    }
}