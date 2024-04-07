class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                left.push(i);
            }
            else if(s.charAt(i) == ')')
            {
                if(!left.isEmpty())
                    left.pop();
                else if(!star.isEmpty())
                    star.pop();
                else 
                    return false;
            }
            else
                star.push(i);
        }
        while(!left.isEmpty() && !star.isEmpty())
        {
            int li = left.pop();
            int si = star.pop();
            if(si<li)
                return false;
        }
        return left.isEmpty();
    }
}