class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max =1 ,count =0;
        for(int i: nums)
        {
            if(!hm.containsKey(i))
                hm.put(i,1);
            else
            {
                hm.put(i,hm.get(i)+1);
                max = Math.max(hm.get(i),max);
            }
        }
        for(int i :nums)
        {
            if(hm.get(i)==max)
            {
                count++;
            }
        }
        return count;
        
    }
}