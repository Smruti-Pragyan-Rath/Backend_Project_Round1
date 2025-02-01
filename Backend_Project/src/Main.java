import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Step 1: Create dummy data
        List<Student> students = DummyData.createDummyData();

        // Step 2: Analyze student performance
        DataAnalyzer.analyzeStudentPerformance(students);

        // Step 3: Generate insights
        for (Student student : students) {
            InsightsGenerator.generateInsights(student);
        }

        // Step 4: Predict rank and college
        double historicalNEETScore = 95.0; // Dummy historical NEET score
        for (Student student : students) {
            double totalScore = 0;
            for (Quiz quiz : student.quizHistory) {
                totalScore += quiz.score;
            }
            double averageScore = totalScore / student.quizHistory.size();

            int predictedRank = RankPredictor.predictRank(averageScore, historicalNEETScore);
            String college = CollegePredictor.predictCollege(predictedRank);

            System.out.println("Student: " + student.userId);
            System.out.println("Predicted Rank: " + predictedRank);
            System.out.println("Likely College: " + college);
            System.out.println();
        }
    }
}