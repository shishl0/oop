package lab2.problem2;

public class Knight extends Piece {

    public Knight(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        int rowDiff = Math.abs(position.row - newPosition.row);
        int colDiff = Math.abs(position.col - newPosition.col);

        return (rowDiff == 2 && colDiff == 1) ||
               (rowDiff == 1 && colDiff == 2);
    }
}