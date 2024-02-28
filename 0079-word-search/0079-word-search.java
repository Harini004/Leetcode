class Solution {
    boolean vis[][];
    public boolean exist(char[][] board, String word) {
     
        
        vis = new boolean[board.length][board[0].length];
        for(int i = 0;i<board.length;i++)
        {
            for(int j = 0;j<board[i].length;j++)
            {
                if((word.charAt(0)==board[i][j]) && search(i,j,0,board,word)  )
                    return true;
            }
        }
        return false;
    }
    private boolean search(int i,int j, int index, char[][] board, String word)
    {
         if(index == word.length())
            return true;
        if(  i>=board.length|| i<0 || j>=board[i].length|| j<0||board[i][j]!= word.charAt(index) ||vis[i][j] )
            return false;
        
       
        vis[i][j] = true;
        if(
            search(i-1,j,index+1,board,word) ||  search(i+1,j,index+1,board,word) ||  search(i,j-1,index+1,board,word) ||  search(i,j+1,index+1,board,word)
        )
            return true;
        vis[i][j] = false;
        return false;
    }
    
    
}