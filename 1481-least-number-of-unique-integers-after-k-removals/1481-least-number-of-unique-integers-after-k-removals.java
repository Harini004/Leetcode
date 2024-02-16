class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:arr)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> freq = new PriorityQueue<>(hm.values());
        
        while(k>0)
        {
            k-=freq.poll();
        }
        return k<0?freq.size()+1:freq.size();
    }
}