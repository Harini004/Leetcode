class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, new StringBuilder(),0,0,n);
        return res;
    }
    private void backtrack(List<String> res, StringBuilder cur, int left, int right, int n)
    {

        if(cur.length()==2*n)
        {
            res.add(cur.toString());
            return;
        }
        
        if(left<n)
        {
            cur.append("(");
            backtrack(res,cur,left+1,right,n);
            cur.deleteCharAt(cur.length()-1);
        }
         if(right<left)
        {
            cur.append(")");
            backtrack(res,cur,left,right+1,n);
            cur.deleteCharAt(cur.length()-1);
        }
    }
}