class Solution {
    public int strStr(String haystack, String needle) {

        int index=0;
        int cnt=0;
        if(haystack.length() >= needle.length()){
            for(int i=0;i<haystack.length();i++){
            
                if(haystack.charAt(i) == needle.charAt(cnt) && needle.length()<=haystack.length()-i){
                    if((haystack.substring(i,i+needle.length())).equals(needle)){
                        return i;
                    }
                }   
            }
        }
        
        return -1;
    }
}