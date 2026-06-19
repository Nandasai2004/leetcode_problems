class Solution {
    public int maxArea(int[] a) {
        int maxA = 0;
        int l = 0;
        int r = a.length - 1;
        while (l < r) {   
            int len = Math.min(a[l], a[r]); 	
            int wid = r - l;             			  
            int area = len * wid;
            maxA = Math.max(area, maxA);
            if (a[l] < a[r])   l++;
            else            r--;
        }
        return maxA; 
    }
}

