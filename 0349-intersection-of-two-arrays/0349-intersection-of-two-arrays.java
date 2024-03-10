class Solution {
    private int[] helper(Set<Integer> set1, Set<Integer> set2)
    {
        int[] res = new int[set1.size()];
        int k =0;
        for(Integer s: set1)
        {
            if(set2.contains(s))
               {
                   res[k++] = s;
               }}
               return Arrays.copyOf(res, k);
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for(Integer n : nums1)
            s1.add(n);
        Set<Integer> s2 = new HashSet<>();
        for(Integer n : nums2)
            s2.add(n);
        if(s1.size()<s2.size())
            return helper(s1,s2);
        else
            return helper(s2,s1);
    }
}