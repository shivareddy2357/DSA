class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int row = 0, col = m-1, count = 0;
        while(row < n && col >=0){
            if(grid[row][col] < 0){
                col--;
                count += n-row;
            }else{
                row++;
            }
        }
        return count;
    }
}