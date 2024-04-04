class Solution {
    public int maxDepth(String s) {
        int ans = 0,open = 0;
        for(Character c : s.toCharArray())
        {
            if(c=='(')
                open++;
            else if(c==')')
                open--;
            ans = Math.max(ans,open);
        }
        return ans;
    }
}