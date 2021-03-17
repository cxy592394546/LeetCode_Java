package O.Q13;

public class movingCount { // dfs
    boolean[][] map;

    public int movingCount(int m, int n, int k) {
        map = new boolean[m][n];
        return count(0, 0, m, n, k);
    }

    private int count(int x, int y, int m, int n, int k) {
        if (x >= m || y >= n || x % 10 + y % 10 + x / 10 + y / 10 > k || map[x][y] == true) {
            return 0;
        }
        map[x][y] = true;
        return 1 + count(x + 1, y, m, n, k) + count(x, y + 1, m, n, k);
    }
}
