package lab1.problem2;

public class Main {
    public static void main(String[] args) {
        GameScore a = new GameScore("Zhan");
        GameScore b = new GameScore();

        a.addScore(50);
        a.addScore(60, "level");
        a.addScore(40, "boss", true);

        System.out.println(a);
        System.out.println("Players created: " + GameScore.getPlayersCreated());

        b.addScore(120, "fast win");
        System.out.println(b);
        System.out.println("Players created: " + GameScore.getPlayersCreated());
    }
}