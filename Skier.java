public class Skier {
    private String name;
    private SingleRunResult run1;
    private SingleRunResult run2;

    public Skier(String n, SingleRunResult r1, SingleRunResult r2) {
        this.name = n;
        this.run1 = r1;
        this.run2 = r2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" : ");
        float result1 = run1.getResult();
        float result2 = run2.getResult();
        float bestResult = Math.max(result1, result2);
        sb.append(String.format("%4.1f\n", bestResult));

        // Mark the lower scoring run with brackets
        if (result1 >= result2) {
            sb.append(run1.toString()).append("\n");
            sb.append("[").append(run2.toString()).append("]");
        } else {
            sb.append("[").append(run1.toString()).append("]\n");
            sb.append(run2.toString());
        }
        return sb.toString();
    }

    public float getResult() {
        return Math.max(run1.getResult(), run2.getResult());
    }

    public String getName() {
        return name;
    }
}
