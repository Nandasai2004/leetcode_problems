
class Solution {
    public int[] twoSum(int[] a, int target) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++){
            int partner=target-a[i];
            if(m.containsKey(partner)){
                return new int[]{i,m.get(partner)};
            }
            m.put(a[i],i);
        }
        return new int[]{};
    }
}