package lab2.bonus;

public class Position {
    public final int row; // 0..7 (0 = top)
    public final int col; // 0..7 (0 = 'a')

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public static Position fromChess(String s) {
        s = s.trim().toLowerCase();
        char file = s.charAt(0); // a..h
        char rank = s.charAt(1); // 1..8

        int col = file - 'a';
        int row = 8 - (rank - '0'); // '8' -> 0, '1' -> 7

        return new Position(row, col);
    }

    public boolean inBounds() {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }
}