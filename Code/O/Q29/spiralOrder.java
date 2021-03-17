package O.Q29;

public class spiralOrder {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) return new int[0];
        int[] ret = new int[matrix.length * matrix[0].length];
        int i = 0, j = 0, m = matrix.length - 1, n = matrix[0].length - 1, num = 0;
        while(num < matrix.length * matrix[0].length){
            for(int t = j; t <= n; t++) ret[num++] = matrix[i][t];
            i++;
            if(num == matrix.length * matrix[0].length) return ret;
            for(int t = i; t <= m; t++) ret[num++] = matrix[t][n];
            n--;
            if(num == matrix.length * matrix[0].length) return ret;
            for(int t = n; t >= j; t--) ret[num++] = matrix[m][t];
            m--;
            if(num == matrix.length * matrix[0].length) return ret;
            for(int t = m; t >= i; t--) ret[num++] = matrix[t][j];
            j++;
            if(num == matrix.length * matrix[0].length) return ret;
        }
        return ret;
    }
}
