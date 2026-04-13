class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] count = new int[n+1];

        for(int i=0;i<n;i++){
            count[Math.min(n,citations[i])]++;
        }

        int h = count.length;
        int paper = 0;

        while(h>paper){
            h--;
            paper = count[h] + paper;
        }

        return h;

        
    }
}