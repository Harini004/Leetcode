class Solution {
    public int sumSubarrayMins(int[] arr) {
       int len = arr.length;
        int[] left = new int[len];
        int[] right = new int[len];
        Deque<Integer> s = new ArrayDeque<>();
        Arrays.fill(left, -1);
        Arrays.fill(right, len);
        for(int i=0;i<len;i++)
        {
            while(!s.isEmpty() && arr[s.peek()] > arr[i])
                s.pop();
            if(!s.isEmpty())
                left[i] = s.peek();
            s.push(i);
        }
        s.clear();
        for(int i=len-1;i>=0;i--)
        {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i])
                s.pop();
            if(!s.isEmpty())
                right[i] = s.peek();
            s.push(i);
        }
       int mod = (int) 1e9 + 7;
        long ans = 0;
        for(int i=0;i<len;i++)
        {
            ans += (long) (i-left[i]) * (right[i] - i)  * arr[i] % mod;
            ans %= mod;
        }
        return (int) ans;
    }
}