class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            HashSet<Character> c = new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(c.contains(board[i][j]))
                    return false;
                else if(board[i][j]!='.')
                    c.add(board[i][j]);
            }
            c.clear();
        }
        for(int i=0;i<9;i++)
        {
            HashSet<Character> c = new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(c.contains(board[j][i]))
                    return false;
                else if(board[j][i]!='.')
                    c.add(board[j][i]);
            }
            c.clear();
        }
        int k=0;
        while(k!=9)
        {
        for(int p=0;p<9;p=p+3)
        {
             HashSet<Character> c = new HashSet<>();
            for(int i=k;i<k+3;i++)
            {
                for(int j=p;j<p+3;j++)
                {
                     if(c.contains(board[i][j]))
                    return false;
                else if(board[i][j]!='.')
                    c.add(board[i][j]);
                }
            }
              c.clear();
        }
            k=k+3;
        }
        return true;
    }
}