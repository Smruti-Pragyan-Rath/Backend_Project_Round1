public class InsightsGenerator {
    public static void generateInsights(Student student) {
        System.out.println("Generating insights for student: " + student.userId);

        // Improvement trends
        double previousScore = 0;
        boolean isImproving = true;
        for (Quiz quiz : student.quizHistory) {
            if (quiz.score < previousScore) {
                isImproving = false;
                break;
            }
            previousScore = quiz.score;
        }
        System.out.println("Improvement Trend: " + (isImproving ? "Improving" : "Needs Improvement"));

        // Performance gaps
        System.out.println("Performance Gaps:");
        for (Quiz quiz : student.quizHistory) {
            if (quiz.score < 70) {
                System.out.println("- " + quiz.topic + " (" + quiz.difficulty + "): " + quiz.score);
            }
        }
        System.out.println();
    }
}