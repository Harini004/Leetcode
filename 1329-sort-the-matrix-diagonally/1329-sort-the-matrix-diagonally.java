class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        for(int col=0;col<n;col++)
        {
          sort(mat,0,col,m,n);
        }
        for(int row=1;row<m;row++)
        {
            sort(mat,row,0,m,n);
        }
        return mat;
    }
    void sort(int[][] mat, int row, int col, int m, int n)
    {
        int r=row,c=col;
        int[] values = new int[101];
        while(r<m && c<n)
        {
            values[mat[r++][c++]]++;
        }
       // Collections.sort(values);
        r=row;c=col;
      for(int i=1;i<101;i++)
      {
          if(values[i]>0)
          {
              int count=values[i];
              while(count-- >0 )
              {
                  mat[r++][c++]=i;
              }
          }
      }
    }
}