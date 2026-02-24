package lab2.problem2;

public class King extends Piece {

    public King(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        int rowDiff = Math.abs(position.row - newPosition.row);
        int colDiff = Math.abs(position.col - newPosition.col);

        return rowDiff <= 1 && colDiff <= 1;
    }
}