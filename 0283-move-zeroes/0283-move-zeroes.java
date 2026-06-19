
class Solution {
    public void moveZeroes(int[] a) {
        int p=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[p]=a[i];
                p++;
            }
        }
        while(p<a.length){
            a[p]=0;
            p++;
        }
    }
}