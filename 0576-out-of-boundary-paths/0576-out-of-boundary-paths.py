class Solution:
    def findPaths(self, m: int, n: int, maxMove: int, startRow: int, startColumn: int) -> int:
        row, col = m,n
        mod = 10**9 + 7
        cache = {}
        def dfs(r,c,move):

            if (r< 0 or r == row or c<0 or c == col):
                return 1
            if move ==0:
                return 0            
            
            if(r,c,move) in cache:
                return cache[(r,c,move)]
            
            cache[(r,c,move)] = ((dfs(r+1,c,move-1) + dfs(r-1,c,move-1)) % mod + (dfs(r,c+1,move-1)+ dfs(r,c-1,move-1)) % mod) % mod
            return cache[(r,c,move)]
        return dfs(startRow,startColumn, maxMove)
            
        