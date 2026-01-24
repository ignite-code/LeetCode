import java.util.stream.Collectors;
class Solution {
    public int majorityElement(int[] nums) {
        int j=0,max=0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
            if(max<hm.get(nums[i])){
                max=hm.get(nums[i]);
                j=i;
            }
        }
        return nums[j];
    }
}