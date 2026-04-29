class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        Arrays.sort(strs);
        int flag = 0;
        int i=0;
        for(;i<strs[0].length();i++){
            if(strs[0].charAt(i) == strs[strs.length-1].charAt(i)){
                flag++;
                continue;
                
            }
            else{
                
                break;
            }
        }
        if(flag > 0){
            return strs[0].substring(0,i);
        }
        return "";
        
    }
}