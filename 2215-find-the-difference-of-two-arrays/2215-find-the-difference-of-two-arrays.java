class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> m1 = new HashSet<>();
        HashSet<Integer> m2 = new HashSet<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for(int i : nums1)
            m1.add(i);
        for(int i: nums2)
            m2.add(i);
        for(int i:m1)
        {
            if(!m2.contains(i))
                l1.add(i);
        }
                for(int i:m2)
        {
            if(!m1.contains(i))
                l2.add(i);
        }
        res.add(l1);
        res.add(l2);
        return res;
    }
}