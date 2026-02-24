package lab2.bonus;

public class Bishop extends Piece {
    public Bishop(Position position, Color color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position to, Board board) {
        if (!to.inBounds()) return false;

        int dr = Math.abs(position.row - to.row);
        int dc = Math.abs(position.col - to.col);
        if (dr != dc) return false;

        if (board.isBlockedDiagonal(position, to)) return false;

        Piece target = board.get(to);
        return target == null || target.getColor() != this.color;
    }

    @Override
    public char symbol() {
        return color == Color.WHITE ? 'B' : 'b';
    }
}