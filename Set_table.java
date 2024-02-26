public class Set_table {
    static String[][] board = new String[21][10];
    public static void board_initialize() {
        for (int i = 6; i < 21; i++) {
            board[i][0] = "*";
            board[i][9] = "*";
            for (int j = 0; j < 10; j++) {
                board[20][j] = "*";
            }
        }
    }
    public static void draw_board() {
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 10; j++) {
                if (board[i][j] == null) {
                    System.out.print(" ");
                } else System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}