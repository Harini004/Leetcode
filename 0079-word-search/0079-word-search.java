class Solution {
    boolean vis[][];
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;
        
        vis = new boolean[r][c];
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                
                if(search(i,j,0,board,word) && (word.charAt(0)==board[i][j]))
                    return true;
            }
        }
        return false;
    }
    private boolean search(int i,int j, int index, char[][] board, String word)
    {
                if(index == word.length())
            return true;
        if(  i>=board.length||i<0 || j>=board[i].length||j<0 || word.charAt(index)!=board[i][j]||vis[i][j] )
            return false;
        

        vis[i][j] = true;
        if(
            search(i+1,j,index+1,board,word) ||  search(i-1,j,index+1,board,word) ||  search(i,j+1,index+1,board,word) ||  search(i,j-1,index+1,board,word)
        )
            return true;
        vis[i][j] = false;
        return false;
    }
    
    
}