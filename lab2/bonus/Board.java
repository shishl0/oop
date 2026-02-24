package lab2.bonus;

public class Board {
    private final Piece[][] board = new Piece[8][8];

    public Piece get(Position p) {
        return board[p.row][p.col];
    }

    public void set(Position p, Piece piece) {
        board[p.row][p.col] = piece;
        if (piece != null) piece.setPosition(p);
    }

    public void setupDefault() {
        // Pawns
        for (int c = 0; c < 8; c++) {
            set(new Position(6, c), new Pawn(new Position(6, c), Color.WHITE));
            set(new Position(1, c), new Pawn(new Position(1, c), Color.BLACK));
        }

        // Rooks
        set(new Position(7, 0), new Rook(new Position(7, 0), Color.WHITE));
        set(new Position(7, 7), new Rook(new Position(7, 7), Color.WHITE));
        set(new Position(0, 0), new Rook(new Position(0, 0), Color.BLACK));
        set(new Position(0, 7), new Rook(new Position(0, 7), Color.BLACK));

        // Knights
        set(new Position(7, 1), new Knight(new Position(7, 1), Color.WHITE));
        set(new Position(7, 6), new Knight(new Position(7, 6), Color.WHITE));
        set(new Position(0, 1), new Knight(new Position(0, 1), Color.BLACK));
        set(new Position(0, 6), new Knight(new Position(0, 6), Color.BLACK));

        // Bishops
        set(new Position(7, 2), new Bishop(new Position(7, 2), Color.WHITE));
        set(new Position(7, 5), new Bishop(new Position(7, 5), Color.WHITE));
        set(new Position(0, 2), new Bishop(new Position(0, 2), Color.BLACK));
        set(new Position(0, 5), new Bishop(new Position(0, 5), Color.BLACK));

        // Queens
        set(new Position(7, 3), new Queen(new Position(7, 3), Color.WHITE));
        set(new Position(0, 3), new Queen(new Position(0, 3), Color.BLACK));

        // Kings
        set(new Position(7, 4), new King(new Position(7, 4), Color.WHITE));
        set(new Position(0, 4), new King(new Position(0, 4), Color.BLACK));
    }

    public void draw() {
        System.out.println("  a b c d e f g h");
        for (int r = 0; r < 8; r++) {
            int rank = 8 - r;
            System.out.print(rank + " ");
            for (int c = 0; c < 8; c++) {
                Piece p = board[r][c];
                System.out.print((p == null ? '.' : p.symbol()) + " ");
            }
            System.out.println(rank);
        }
        System.out.println("  a b c d e f g h");
    }

    public boolean move(Position from, Position to, Color turn) {
        if (!from.inBounds() || !to.inBounds()) return false;

        Piece piece = get(from);
        if (piece == null) return false;
        if (piece.getColor() != turn) return false;

        if (!piece.isLegalMove(to, this)) return false;

        // do move
        set(to, piece);
        set(from, null);
        return true;
    }

    // ===== Helpers for line / diagonal blocking =====

    public boolean isBlockedLine(Position from, Position to) {
        if (from.row == to.row) {
            int step = Integer.compare(to.col, from.col);
            for (int c = from.col + step; c != to.col; c += step) {
                if (board[from.row][c] != null) return true;
            }
            return false;
        }
        if (from.col == to.col) {
            int step = Integer.compare(to.row, from.row);
            for (int r = from.row + step; r != to.row; r += step) {
                if (board[r][from.col] != null) return true;
            }
            return false;
        }
        return true; // not a line move
    }

    public boolean isBlockedDiagonal(Position from, Position to) {
        int dr = to.row - from.row;
        int dc = to.col - from.col;
        if (Math.abs(dr) != Math.abs(dc)) return true;

        int stepR = Integer.compare(to.row, from.row);
        int stepC = Integer.compare(to.col, from.col);

        int r = from.row + stepR;
        int c = from.col + stepC;
        while (r != to.row && c != to.col) {
            if (board[r][c] != null) return true;
            r += stepR;
            c += stepC;
        }
        return false;
    }
}