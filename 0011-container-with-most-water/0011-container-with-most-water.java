class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int max=0;
        while(start<end){
            if(height[start]<height[end]){
                max = Math.max(max,height[start]*(end-start));
                start++;
            }
            else{
                max = Math.max(max,height[end]*(end-start));
                end--;
            }
        }
        return max;

        // int i=0,j=height.length-1;
        // int maxWater = 0;
        // while(j-i!=0){
        //     int max=Math.min(height[i],height[j]*(j-i));
        //     if(height[i]<height[j]){
        //         i++;
        //     }else{
        //         j--;
        //     } 
        //     if(max>maxWater){
        //         maxWater=max;
        //     }  
        // }
        // return maxWater;
    }
}