class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 1){
            return strs[0];
        }
        Arrays.sort(strs);
        int flag = 0;
        
        for(int i=0;i<strs[0].length();i++){
            if(strs[0].charAt(i) != strs[strs.length-1].charAt(i)){
                break;
            }
            flag++;
        }
        if(flag > 0){
            return strs[0].substring(0,flag);
        }
        return "";
        
    }
}