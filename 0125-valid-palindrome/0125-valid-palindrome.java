class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        String str1 = str.replaceAll("[^a-zA-Z0-9]","");
        
        int start=0;
        int end=str1.length()-1;

        while(start<end){
            if(str1.charAt(start)==str1.charAt(end)){
                start++;
                end--;
                continue;
            }
            else return false;
        }
        return true;
    }
}