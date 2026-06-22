class Solution {
    public void sortColors(int[] a) {
        int noZeros=0;
        int noOnes=0;
        int noTwos=0;
        for(int n:a){
            if(n==0)    noZeros++;
            else if(n==1)   noOnes++;
            else        noTwos++;
        }
        int i=0;
        while(noZeros!=0){
            a[i]=0; 
            i++;
            noZeros--;
        }
        while(noOnes!=0){
            a[i]=1; 
            i++;
            noOnes--;
        }
        while(noTwos!=0){
            a[i]=2; 
            i++;
            noTwos--;
        }
    }
}