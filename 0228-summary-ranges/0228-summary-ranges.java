class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> list = new ArrayList<>();
        if (nums.length == 0) {
            return list;
        }
        int min = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1 != nums[i+1]){
                if(min == i){
                    list.add(Integer.toString(nums[i]));
                }else{
                    list.add(Integer.toString(nums[min]) + "->" + Integer.toString(nums[i]));
                }
                min = i+1;
            }
        }
        if (min == nums.length - 1) {
            list.add(Integer.toString(nums[min]));
        } else {
            list.add(nums[min] + "->" + nums[nums.length - 1]);
        }
        return list;
    }
}