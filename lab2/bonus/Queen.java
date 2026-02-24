package lab2.bonus;

public class Queen extends Piece {
    public Queen(Position position, Color color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position to, Board board) {
        if (!to.inBounds()) return false;

        boolean rookLike = (position.row == to.row || position.col == to.col);
        boolean bishopLike = Math.abs(position.row - to.row) == Math.abs(position.col - to.col);

        if (!rookLike && !bishopLike) return false;

        if (rookLike && board.isBlockedLine(position, to)) return false;
        if (bishopLike && board.isBlockedDiagonal(position, to)) return false;

        Piece target = board.get(to);
        return target == null || target.getColor() != this.color;
    }

    @Override
    public char symbol() {
        return color == Color.WHITE ? 'Q' : 'q';
    }
}