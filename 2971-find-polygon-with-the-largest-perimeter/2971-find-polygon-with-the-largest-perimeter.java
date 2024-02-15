class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        long ans = -1;
        for(int num:nums)
        {
            if(num<sum)
            {
                ans = num+sum;
            }
            sum+=num;
        }
        return ans;
    }
}