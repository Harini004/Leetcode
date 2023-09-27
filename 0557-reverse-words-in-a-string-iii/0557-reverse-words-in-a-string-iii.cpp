class Solution {
public:
    string reverseWords(string s) {
        int i =0,n=s.size();
        stack<char> st;
        string ans = "";
        for(int i =0;i<n;i++)
        {
            if(s[i]!=' ')
                st.push(s[i]);
            else
            {
                while(!st.empty())
                {
                    char temp = st.top();
                    st.pop();
                    ans.push_back(temp);
                }
                if(ans.length()!=0)
                    ans.push_back(' ');
            }
        }
         while(!st.empty())
                {
                    char temp = st.top();
                    st.pop();
                    ans.push_back(temp);
                }
        return ans;
    }
};