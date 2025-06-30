class Solution {
    public int trap(int[] height) {
       
        int start=0;
        int end=height.length-1;
        int res=0;
        int lmax=0;
        int rmax=0;
        while(start<end){
            if(height[start]<height[end]){
                lmax = Math.max(lmax,height[start]);
                res += Math.max(0,lmax-height[start]);
                start++;
            }
            else if(height[start]>=height[end]){
                rmax = Math.max(rmax,height[end]);
                res += Math.max(0,rmax-height[end]);
                end--;
            }
        }
        return res;

    }
}