package StarTask;

public class StarTriangle {
    private int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int row = 1; row <= width; row++) {
            for (int col = 1; col <= row; col++) {
                sb.append("[*]");
            }
            if (row < width) sb.append("\n");
        }

        return sb.toString();
    }
}