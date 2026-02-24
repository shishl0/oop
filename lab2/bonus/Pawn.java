package lab2.bonus;

public class Pawn extends Piece {
    public Pawn(Position position, Color color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position to, Board board) {
        if (!to.inBounds()) return false;

        int dir = (color == Color.WHITE) ? -1 : 1; // white: to smaller row
        int startRow = (color == Color.WHITE) ? 6 : 1;

        int dr = to.row - position.row;
        int dc = Math.abs(to.col - position.col);

        Piece target = board.get(to);

        // forward 1
        if (dc == 0 && dr == dir && target == null) return true;

        // forward 2 from start
        if (dc == 0 && position.row == startRow && dr == 2 * dir) {
            Position mid = new Position(position.row + dir, position.col);
            return board.get(mid) == null && target == null;
        }

        // capture diagonally
        if (dc == 1 && dr == dir && target != null && target.getColor() != this.color) return true;

        return false;
    }

    @Override
    public char symbol() {
        return color == Color.WHITE ? 'P' : 'p';
    }
}