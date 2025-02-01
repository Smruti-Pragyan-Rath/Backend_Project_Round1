public class CollegePredictor {
    public static String predictCollege(int predictedRank) {
        // Hardcoded cutoff data for colleges
        if (predictedRank <= 100) {
            return "Top Medical College A";
        } else if (predictedRank <= 500) {
            return "Medical College B";
        } else if (predictedRank <= 1000) {
            return "Medical College C";
        } else if (predictedRank <= 5000) {
            return "Medical College D";
        } else if (predictedRank <= 10000) {
            return "Medical College E";
        } else {
            return "No college found";
        }
    }
}