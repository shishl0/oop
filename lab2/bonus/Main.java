package lab2.bonus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        board.setupDefault();

        Scanner sc = new Scanner(System.in);
        Color turn = Color.WHITE;

        while (true) {
            board.draw();
            System.out.println("Turn: " + (turn == Color.WHITE ? "WHITE" : "BLACK"));
            System.out.print("Enter move (e2 e4) or 'exit': ");

            String line = sc.nextLine().trim();
            if (line.equalsIgnoreCase("exit")) break;

            String[] parts = line.split("\\s+");
            if (parts.length != 2) {
                System.out.println("Bad input. Example: e2 e4");
                continue;
            }

            try {
                Position from = Position.fromChess(parts[0]);
                Position to = Position.fromChess(parts[1]);

                boolean ok = board.move(from, to, turn);
                if (!ok) {
                    System.out.println("Illegal move.");
                    continue;
                }

                // switch turn
                turn = (turn == Color.WHITE) ? Color.BLACK : Color.WHITE;

            } catch (Exception e) {
                System.out.println("Bad input format. Use like: e2 e4");
            }
        }

        sc.close();
        System.out.println("Game ended.");
    }
}