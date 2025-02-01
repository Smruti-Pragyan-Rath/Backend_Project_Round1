import java.util.*;

class Quiz {
    String userId;
    String topic;
    String difficulty; // Easy, Medium, Hard
    double score;
    Map<String, String> responseMap; // Key: Question ID, Value: Selected Option ID

    public Quiz(String userId, String topic, String difficulty, double score, Map<String, String> responseMap) {
        this.userId = userId;
        this.topic = topic;
        this.difficulty = difficulty;
        this.score = score;
        this.responseMap = new HashMap<>(responseMap); // Fix: Avoid reference issue by creating a new HashMap
    }
}

class Student {
    String userId;
    List<Quiz> quizHistory;

    public Student(String userId, List<Quiz> quizHistory) {
        this.userId = userId;
        this.quizHistory = new ArrayList<>(quizHistory); // Fix: Avoid reference issue by creating a new ArrayList
    }
}