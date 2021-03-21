package O.Q47;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maxValue(new int[][]{{1}}));
    }

    public static int maxValue(int[][] grid) {
        int[][] val = new int[grid.length][grid[0].length];
        val[0][0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            val[i][0] = val[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < grid[0].length; i++) {
            val[0][i] = val[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < val.length; i++) {
            for (int j = 1; j < val[0].length; j++) {
                val[i][j] = val[i - 1][j] > val[i][j - 1] ? val[i - 1][j] + grid[i][j] : val[i][j - 1] + grid[i][j];
            }
        }
        return val[val.length - 1][val[0].length - 1];
    }
}
