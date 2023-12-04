public class SingleRunResult {
    private int runNumber;
    private float[] scores;

    public SingleRunResult(int rn, float[] sc) {
        this.runNumber = rn;
        this.scores = sc.clone();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(runNumber).append(": ");
        float min = Float.MAX_VALUE;
        float max = Float.MIN_VALUE;
        float sum = 0;
        for (float score : scores) {
            if (score < min) min = score;
            if (score > max) max = score;
            sum += score;
            sb.append(String.format("%5.1f ", score));
        }
        sum -= min + max; // Remove the highest and the lowest score
        float average = sum / (scores.length - 2); // Calculate average of the remaining scores
        // Append the discarded scores in brackets
        sb.append(String.format("(%4.1f) (%4.1f) == %4.1f", min, max, average));
        return sb.toString();
    }

    public float getResult() {
        float min = Float.MAX_VALUE;
        float max = Float.MIN_VALUE;
        float sum = 0;
        for (float score : scores) {
            if (score < min) min = score;
            if (score > max) max = score;
            sum += score;
        }
        sum -= min + max; // Remove the highest and the lowest score
        return sum / (scores.length - 2); // Calculate average of the remaining scores
    }
}

