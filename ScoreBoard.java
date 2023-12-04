import java.util.Arrays;

public class ScoreBoard {
    private Skier[] skiers;

    public ScoreBoard(Skier[] sk) {
        this.skiers = sk.clone();
    }

    public Skier getWinner() {
        return Arrays.stream(skiers)
                .max((s1, s2) -> Float.compare(s1.getResult(), s2.getResult()))
                .orElse(null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Skier skier : skiers) {
            sb.append(skier.toString()).append("\n");
        }
        Skier winner = getWinner();
        if (winner != null) {
            sb.append("The winner is ").append(winner.getName()).append(" (").append(winner.getResult()).append(")");
        }
        return sb.toString();
    }
}
