package lab2.problem2;

public class Pawn extends Piece {

    public Pawn(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        return newPosition.col == position.col &&
               newPosition.row == position.row + 1;
    }
}