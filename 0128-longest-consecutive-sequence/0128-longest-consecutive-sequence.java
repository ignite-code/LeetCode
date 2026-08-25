import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().sorted().distinct().collect(Collectors.toList());
        int cnt=0, max=0;
        if(list.size() == 1){
            return 1;
        }
        for(int i=1;i<list.size();i++){
            if(list.get(i-1)+1 == list.get(i)){
                cnt++;
            }
            else{
                cnt=0;
            }
            if(max<=cnt){
                max=cnt+1;
            }
        }
        return max;
    }
}