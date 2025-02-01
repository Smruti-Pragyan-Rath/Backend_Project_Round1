import java.util.*;
public class DummyData {
    public static List<Student> createDummyData() {
        List<Student> students = new ArrayList<>();

        // Student 1
        Map<String, String> responses1 = new HashMap<>();
        responses1.put("Q1", "A");
        responses1.put("Q2", "B");
        List<Quiz> quizzes1 = Arrays.asList(
                new Quiz("S1", "Biology", "Easy", 85.0, responses1),
                new Quiz("S1", "Chemistry", "Medium", 70.0, responses1)
        );
        students.add(new Student("S1", quizzes1));

        // Student 2
        Map<String, String> responses2 = new HashMap<>();
        responses2.put("Q1", "C");
        responses2.put("Q2", "D");
        List<Quiz> quizzes2 = Arrays.asList(
                new Quiz("S2", "Biology", "Easy", 90.0, responses2),
                new Quiz("S2", "Physics", "Hard", 65.0, responses2)
        );
        students.add(new Student("S2", quizzes2));

        return students;
    }
}