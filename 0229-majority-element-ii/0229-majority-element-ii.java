class Solution {
    public List<Integer> majorityElement(int[] a) {
        int n = a.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i:a)
           map.put(i,map.getOrDefault(i,0)+1);
        List<Integer>res = new ArrayList<>();
        for(Integer key:map.keySet()){
            if(map.get(key)>n/3) res.add(key);
        }
        return res;
        
    }
}