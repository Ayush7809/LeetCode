class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n = grid.length,  m = grid[0].length, ans=0;
        int [][] x = new int[n+1][m+1], y = new int[n+1][m+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                // frequency count krni h x aur y ki
                x[i+1][j+1] = x[i][j+1] + x[i+1][j] - x[i][j] + (grid[i][j]=='X' ? 1:0); // xcount
                y[i+1][j+1] = y[i][j+1] + y[i+1][j] - y[i][j] + (grid[i][j]=='Y' ? 1:0); // ycount
                // xcount== ycount ho aur xcount >0 ho tb ans++ krna h
                if(x[i+1][j+1] == y[i+1][j+1] && x[i+1][j+1]>0)
                    ans++;
            }
        }
        return ans;
    }
}