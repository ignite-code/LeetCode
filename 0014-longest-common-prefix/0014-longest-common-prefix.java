class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        if(strs.length==1){
            return strs[0];
        }
        int cnt = 0;
        for(int i=0;i<strs[0].length();i++){
            if(strs[0].charAt(i) != strs[strs.length-1].charAt(i)){
                break;
            }
            cnt++;
        }
        if(cnt>0){
            return strs[0].substring(0,cnt);
        }
        return "";
    }
}