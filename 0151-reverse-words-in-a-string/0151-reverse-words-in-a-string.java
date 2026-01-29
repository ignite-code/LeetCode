class Solution {
    public String reverseWords(String s) {
        String sen = s.trim();
        int j=sen.length();
        List<String> str = new ArrayList<>();
        for(int i=sen.length()-1;i>=0;i--){
            if(Character.isWhitespace(sen.charAt(i))){
                if (i + 1 < j) {               
                    str.add(sen.substring(i + 1, j));
                }
                j = i;
            }
        }
        if(j>0)
            str.add(sen.substring(0, j));
        String result = String.join(" ", str);
        return result;
    }
}