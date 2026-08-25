class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zeros = 0;
        for(int num:nums){
            if(num == 0){
                zeros++;
            }
            else{
                prod *= num;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(zeros>1){
                nums[i] = 0;
            }
            else if(zeros == 1){
                nums[i] = (nums[i] == 0)?prod:0;
            }
            else{
                nums[i] = prod/nums[i];
            }
        }
        return nums;
    }
}