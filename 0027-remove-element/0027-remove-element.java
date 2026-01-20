class Solution {
    public int removeElement(int[] nums, int val) {
        
        int cnt = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==val){
                nums[i] = -1;
                cnt++;
            }
        }
        Arrays.sort(nums);
        for(int i=0,j=nums.length-1;i<cnt;i++,j--){
            nums[i] = nums[j];
        }
        int k = nums.length-cnt;
        return k;
    }
}