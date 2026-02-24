package lab2.bonus;

public class Rook extends Piece {
    public Rook(Position position, Color color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position to, Board board) {
        if (!to.inBounds()) return false;
        if (position.row != to.row && position.col != to.col) return false;

        if (board.isBlockedLine(position, to)) return false;

        Piece target = board.get(to);
        return target == null || target.getColor() != this.color;
    }

    @Override
    public char symbol() {
        return color == Color.WHITE ? 'R' : 'r';
    }
}