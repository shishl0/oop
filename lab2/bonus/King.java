package lab2.bonus;

public class King extends Piece {
    public King(Position position, Color color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position to, Board board) {
        if (!to.inBounds()) return false;

        int dr = Math.abs(position.row - to.row);
        int dc = Math.abs(position.col - to.col);
        if (dr > 1 || dc > 1) return false;

        Piece target = board.get(to);
        return target == null || target.getColor() != this.color;
    }

    @Override
    public char symbol() {
        return color == Color.WHITE ? 'K' : 'k';
    }
}