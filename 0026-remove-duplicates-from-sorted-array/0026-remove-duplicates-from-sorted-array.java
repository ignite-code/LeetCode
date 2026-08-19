import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> l = Arrays.stream(nums)
                           .boxed()
                           .collect(Collectors.toList());;
        List<Integer> set = l.stream().distinct().collect(Collectors.toList());
        for(int i=0; i<set.size(); i++){
            nums[i] = set.get(i);
        }
        return set.size();
        
    }
}