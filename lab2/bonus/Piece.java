package lab2.bonus;

public abstract class Piece {
    protected Position position;
    protected final Color color;

    public Piece(Position position, Color color) {
        this.position = position;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position p) {
        this.position = p;
    }

    public abstract boolean isLegalMove(Position to, Board board);

    public abstract char symbol();
}