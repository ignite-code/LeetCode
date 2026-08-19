import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> l = Arrays.stream(nums)
                           .boxed()
                           .distinct()
                           .collect(Collectors.toList());;
        
        for(int i=0; i<l.size(); i++){
            nums[i] = l.get(i);
        }
        return l.size();
        
    }
}