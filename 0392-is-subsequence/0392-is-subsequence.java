class Solution {
    public boolean isSubsequence(String s, String t) {
        int cnt=0;
        if(s.length()==0)
        return true;
        for(int i=0,j=0;i<s.length() && j<t.length();j++){
            if(t.charAt(j)==s.charAt(i)){
                cnt++;
                i++;
            }
        }
        if(cnt==s.length()){
            return true;
        }
        return false;

    }
}