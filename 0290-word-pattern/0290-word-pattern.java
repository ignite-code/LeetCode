class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm = new HashMap<>();
        String[] str = s.split(" ");
        if(pattern.length()!=str.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            if(!hm.containsKey(pattern.charAt(i)) && !hm.containsValue(str[i])){
                hm.put(pattern.charAt(i),str[i]);
            }else if(hm.containsKey(pattern.charAt(i))){
                if(!hm.get(pattern.charAt(i)).equals(str[i])){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}