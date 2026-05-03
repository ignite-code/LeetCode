class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str.append(s.charAt(i));
            }else{
                continue;
            }
        }
        return palindrome(str.toString())?true:false;
    }

    public static boolean palindrome(String text) {
        if (text == null) return false;
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }
}