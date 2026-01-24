class Solution {
    public void rotate(int[] nums, int k) {
         k = k % nums.length;
        if(k>0){
        
        int[] arr = new int[k];
        for(int j=0;j<k;j++){
                 arr[j] = nums[nums.length-k+j];
        }
        for(int i=nums.length-k-1;i>=0;i--){
            nums[i+k] = nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i] = arr[i];
        }

        }
    }
}