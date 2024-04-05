class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++)
        {
            if(!st.isEmpty() && Math.abs(s.charAt(i)-st.peek() )== 32 )
                st.pop();
            else
                st.push(s.charAt(i));
        }
        for(char c: st)
            sb.append(c);
        return sb.toString();
    }
}