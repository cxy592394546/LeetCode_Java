package O.Q12;

public class exist {
    public static void main(String[] args) {
        char[][] board = {{'C', 'A', 'A'}, {'A', 'A', 'A'}, {'B', 'C', 'D'}};
        String word = "AAB";


        char[][] cp = board;
        char[] str = word.toCharArray();


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (find(cp, str, i, j, 0)) {
                    System.out.println("true");
                    return;
                }
                cp = board;
            }
        }
        System.out.println("false");
    }

    private static boolean find(char[][] board, char[] str, int i, int j, int num) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != str[num]) {
            return false;
        }
        if (num == str.length - 1) {
            return true;
        }

        char temp = board[i][j];
        board[i][j] = '#';
        boolean isFind = find(board, str, i + 1, j, num + 1) || find(board, str, i - 1, j, num + 1) || find(board, str, i, j + 1, num + 1) || find(board, str, i, j - 1, num + 1);
        board[i][j] = temp;

        return isFind;
    }
}
