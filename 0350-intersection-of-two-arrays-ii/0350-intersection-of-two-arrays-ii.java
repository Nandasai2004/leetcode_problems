
class Solution {
    public int[] intersect(int[] a1, int[] a2) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:a1){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i:a2){
            if(m.containsKey(i)&& m.get(i)>0){
                ans.add(i);
                m.put(i,m.get(i)-1);
            }
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}