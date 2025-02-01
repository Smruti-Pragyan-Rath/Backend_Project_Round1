import java.util.*;
public class DataAnalyzer {
    public static void analyzeStudentPerformance(List<Student> students) {
        for (Student student : students) {
            System.out.println("Analyzing performance for student: " + student.userId);

            // Calculate average score
            double totalScore = 0;
            for (Quiz quiz : student.quizHistory) {
                totalScore += quiz.score;
            }
            double averageScore = totalScore / student.quizHistory.size();
            System.out.println("Average Score: " + averageScore);

            // Performance by topic
            Map<String, Double> topicScores = new HashMap<>();
            for (Quiz quiz : student.quizHistory) {
                topicScores.put(quiz.topic, topicScores.getOrDefault(quiz.topic, 0.0) + quiz.score);
            }
            System.out.println("Performance by Topic:");
            topicScores.forEach((topic, score) -> System.out.println("- " + topic + ": " + score));

            // Performance by difficulty
            Map<String, Double> difficultyScores = new HashMap<>();
            for (Quiz quiz : student.quizHistory) {
                difficultyScores.put(quiz.difficulty, difficultyScores.getOrDefault(quiz.difficulty, 0.0) + quiz.score);
            }
            System.out.println("Performance by Difficulty:");
            difficultyScores.forEach((difficulty, score) -> System.out.println("- " + difficulty + ": " + score));

            // Weak areas (score < 70)
            System.out.println("Weak Areas:");
            for (Quiz quiz : student.quizHistory) {
                if (quiz.score < 70) {
                    System.out.println("- " + quiz.topic + " (" + quiz.difficulty + "): " + quiz.score);
                }
            }
            System.out.println();
        }
    }
}