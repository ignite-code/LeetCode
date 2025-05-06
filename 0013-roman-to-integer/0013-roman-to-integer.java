class Solution {
    public int romanToInt(String s) {
        int cnt=0;
        char[] arr = new char[128];
        arr['I'] = 1;
        arr['V'] = 5;
        arr['X'] = 10;
        arr['L'] = 50;
        arr['C'] = 100;
        arr['D'] = 500;
        arr['M'] = 1000;

        for(int i=0;i<s.length()-1;i++){
            if(arr[s.charAt(i)] < arr[s.charAt(i+1)]){
                cnt -= arr[s.charAt(i)];
            }
            else{
                cnt += arr[s.charAt(i)];
            }
        }
        cnt += arr[s.charAt(s.length()-1)];
        return cnt;
    }
}