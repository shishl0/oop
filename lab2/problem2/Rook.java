package lab2.problem2;

public class Rook extends Piece {

    public Rook(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        return position.row == newPosition.row ||
               position.col == newPosition.col;
    }
}