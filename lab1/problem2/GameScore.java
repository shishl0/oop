package lab1.problem2;

import java.time.LocalDateTime;

public class GameScore {
    public enum Medal {
        NONE, BRONZE, SILVER, GOLD
    }

    public static final int MAX_POINTS_PER_MOVE = 100;

    private static int playersCreated = 0;

    private final int playerId;
    private final LocalDateTime createdAt;

    private String playerName;
    private int score;

    {
        createdAt = LocalDateTime.now();
    }

    // constructor #1
    public GameScore(String playerName) {
        this.playerName = (playerName == null || playerName.trim().isEmpty())
                ? "Player"
                : playerName.trim();

        playersCreated++;
        this.playerId = playersCreated;
        this.score = 0;
    }

    // constructor #2 (overloaded)
    public GameScore() {
        this("Player");
    }

    // getters
    public int getPlayerId() { return playerId; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public String getPlayerName() { return playerName; }
    public int getScore() { return score; }

    // methods
    public void addScore(int points) {
        addScore(points, "move");
    }

    public void addScore(int points, String reason) {
        addScore(points, reason, false);
    }

    public void addScore(int points, String reason, boolean bonus) {
        int safe = Math.max(0, Math.min(points, MAX_POINTS_PER_MOVE));
        if (bonus) safe *= 2;

        score += safe;

        String r = (reason == null || reason.trim().isEmpty()) ? "move" : reason.trim();
        System.out.println(playerName + " +" + safe + " points (" + r + ")");
    }

    public Medal getMedal() {
        if (score >= 300) return Medal.GOLD;
        if (score >= 200) return Medal.SILVER;
        if (score >= 100) return Medal.BRONZE;
        return Medal.NONE;
    }

    public static int getPlayersCreated() {
        return playersCreated;
    }

    @Override
    public String toString() {
        return "GameScore{" +
                "playerId=" + playerId +
                ", createdAt=" + createdAt +
                ", playerName='" + playerName + '\'' +
                ", score=" + score +
                ", medal=" + getMedal() +
                '}';
    }
}