package lab2.problem2;

public class Queen extends Piece {

    public Queen(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        boolean rookMove = position.row == newPosition.row ||
                           position.col == newPosition.col;

        boolean bishopMove =
                Math.abs(position.row - newPosition.row) ==
                Math.abs(position.col - newPosition.col);

        return rookMove || bishopMove;
    }
}