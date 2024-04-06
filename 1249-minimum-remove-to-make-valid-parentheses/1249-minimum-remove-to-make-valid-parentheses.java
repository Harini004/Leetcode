class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder res = new StringBuilder();
        int o =0;
        for(char c: s.toCharArray())
        {
            if(c == '(')
                o++;
            else if(c == ')')
            {
                if(o==0)
                    continue;
                o--;
            }
            res.append(c);
        }
        StringBuilder ans = new StringBuilder();
        for(int i = res.length()-1;i>=0;i--)
        {
            if(res.charAt(i) == '(' && o -- >0)
                continue;
            ans.append(res.charAt(i));
        }
        return ans.reverse().toString();
    }
}