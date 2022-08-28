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
        List<Integer> values = new ArrayList<>();
        while(r<m && c<n)
        {
            values.add(mat[r++][c++]);
        }
        Collections.sort(values);
        r=row;c=col;
        int index=0;
        while(r<m && c<n)
        {
            mat[r++][c++]=values.get(index++);
        }
    }
}