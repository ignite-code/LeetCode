class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = nums1.length;
        
        for(int i=m,j=0; i<size; i++,j++){
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}