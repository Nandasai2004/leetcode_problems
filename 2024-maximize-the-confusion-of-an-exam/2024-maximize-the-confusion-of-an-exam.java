
class Solution {
    public int f(String s, int k,char ch){
        int i=0;
        int count=0;                                                                            
        int maxL=0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)==ch) count++;
            while(count>k){
                if(s.charAt(i)==ch) count--;
                i++;
            }
            maxL=Math.max(maxL,j-i+1);
        }
        return maxL;
    }
    public int maxConsecutiveAnswers(String s, int k) {
        return Math.max(f(s,k,'T'),f(s,k,'F'));
    }
}