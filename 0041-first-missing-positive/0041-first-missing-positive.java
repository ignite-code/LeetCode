import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().sorted().distinct().collect(Collectors.toList());

        int n = 1;
        for(int i=0;i<list.size();i++){
            if(list.get(i) > 0){
                if(n == list.get(i)){
                    n++;
                    continue;
                }
                else{
                    break;
                }
            }
        }
        return n;
    }
}