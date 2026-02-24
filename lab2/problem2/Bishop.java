package lab2.problem2;

public class Bishop extends Piece {

    public Bishop(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        return Math.abs(position.row - newPosition.row) ==
               Math.abs(position.col - newPosition.col);
    }
}