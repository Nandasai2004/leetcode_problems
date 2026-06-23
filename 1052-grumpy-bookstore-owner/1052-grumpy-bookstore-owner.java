class Solution {
    public int maxSatisfied(int[] cus, int[] gr, int min) {
        int satisfied=0;
        for(int i=0;i<cus.length;i++){
            if(gr[i]==0)    satisfied=satisfied+cus[i];
        }
        int extra=0;
        for(int i=0;i<min;i++){
            if(gr[i]==1)    extra=extra+cus[i];
        }
        int maxE=extra;
        for(int i=min;i<cus.length;i++){
            if(gr[i]==1)    extra=extra+cus[i];
            if(gr[i-min]==1)    extra=extra-cus[i-min];
            maxE=Math.max(maxE,extra);
        }
        return satisfied+maxE;
    }
}
