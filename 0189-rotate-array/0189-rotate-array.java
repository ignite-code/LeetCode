class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;

        int[] arr = new int[nums.length-k];
        for(int i=0;i<arr.length;i++){
            arr[i] = nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i] = nums[nums.length-k+i];
        }
        for(int i=0;i<arr.length;i++){
            nums[i+k] = arr[i];
        }
        
    }
}