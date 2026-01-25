class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm = new HashMap<>();
        if(s.length() == 1){
            return true;
        }
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i)) && !hm.containsValue(t.charAt(i))){
                hm.put(s.charAt(i),t.charAt(i));
            }
            else if(hm.containsKey(s.charAt(i))){
                if(!hm.get(s.charAt(i)).equals(t.charAt(i)) ){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}