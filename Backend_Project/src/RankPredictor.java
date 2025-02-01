public class RankPredictor {
    public static int predictRank(double averageScore, double historicalNEETScore) {
        // Dummy probabilistic model: Rank = (1000 - (averageScore * 10)) * (historicalNEETScore / 100)
        return (int) ((1000 - (averageScore * 10)) * (historicalNEETScore / 100));
    }
}