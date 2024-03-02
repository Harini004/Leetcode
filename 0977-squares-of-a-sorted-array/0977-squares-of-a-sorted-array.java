class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length-1 , e = nums.length - 1;
        int[] res = new int[nums.length];
        while(l<=r)
        {

            if(Math.abs(nums[l])<=Math.abs(nums[r]))
            {
                 res[e--] = nums[r]*nums[r];
                r--;
                
            }
            else 
            {
               res[e--] = nums[l]*nums[l];
                l++;
            }
        }
        return res;
    }
}