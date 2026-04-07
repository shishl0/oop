package lab3.problem2;

public class Plane implements Flyable {
    private int x;
    private int y;
    private int z;

    public Plane(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void flyUp() {
        z++;
    }

    @Override
    public void flyDown() {
        z--;
    }
}
