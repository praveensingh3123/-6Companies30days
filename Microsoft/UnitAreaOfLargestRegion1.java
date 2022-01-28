package Microsoft;

public class UnitAreaOfLargestRegion1 {
	static int dfs(int[][] grid,int i,int j)
    {
        if(i<0 || j<0 || i>grid.length-1 || j>grid[0].length-1 || grid[i][j]!=1)
        {
            return 0;
        }
         
        grid[i][j]=0;
        int area=1;
        area+=dfs(grid,i+1,j);
        area+=dfs(grid,i-1,j);
        area+=dfs(grid,i,j+1);
        area+=dfs(grid,i,j-1);
        area+=dfs(grid,i+1,j+1);
        area+=dfs(grid,i-1,j-1);
        area+=dfs(grid,i-1,j+1);
        area+=dfs(grid,i+1,j-1);
        
        
        return area;
        
    }
}
