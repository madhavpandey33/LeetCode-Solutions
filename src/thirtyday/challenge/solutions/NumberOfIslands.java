package thirtyday.challenge.solutions;

/**
 * https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/530/week-3/3302/
 */
public class NumberOfIslands {

  public static void main(String[] args) {
    char [][] grid = {
                        {'1','1','1','1','0'},
                        {'1','1','0','1','0'},
                        {'1','1','0','0','0'},
                        {'0','0','0','0','0'}
    };

    System.out.println(numIslands(grid));

  }

  public static int numIslands(char[][] grid) {
    if(grid == null || grid.length == 0){
      return 0;
    }

    int numofIslands = 0;

    for(int i=0; i< grid.length; i++){
      for(int j = 0; j<grid[i].length; j++) {
        if(grid[i][j] == '1') {
          numofIslands += dfs(grid, i, j);
        }
      }
    }


    return numofIslands;
  }

  private static int dfs(char[][] grid, int i, int j) {
    // this check make sure we don't go outside the matrix and there is no 0 present in the path
    if(i >= grid.length || i< 0 || j>= grid[i].length || j <0 || grid[i][j] == '0') {
      return 0;
    }

    grid[i][j] = '0';
    dfs(grid, i+1, j);
    dfs(grid, i-1, j);
    dfs(grid, i, j+1);
    dfs(grid, i, j-1);

    return 1;
  }

}