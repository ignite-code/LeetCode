import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int expectedTotal = len * (len+1) / 2;
        int actualTotal=0;
        for(int i=0;i<len;i++){
            actualTotal += nums[i];
        }
        return expectedTotal-actualTotal;

        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] == i) continue;
        //     else{
        //         return i;
        //     }
        // }
        // return nums.length;
    }
}