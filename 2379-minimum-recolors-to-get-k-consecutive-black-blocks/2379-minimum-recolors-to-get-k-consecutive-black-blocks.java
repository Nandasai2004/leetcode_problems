class Solution {
    public int minimumRecolors(String s, int k) {
        int white=0;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='W')    white++;
        }
        int minW=white;
        for(int i=k;i<s.length();i++){
            if(s.charAt(i)=='W')    white++;
            if(s.charAt(i-k)=='W')    white--;
            minW=Math.min(white,minW);
        }
        return minW;
    }
}