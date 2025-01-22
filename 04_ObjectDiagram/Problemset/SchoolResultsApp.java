import java.util.ArrayList;
import java.util.List;

// Subject class
class Subject {
    private String name;
    private int score;

    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

// Student class
class Student {
    private String name;
    private List<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}

// GradeCalculator class
class GradeCalculator {
    public static String calculateGrade(Student student) {
        List<Subject> subjects = student.getSubjects();
        if (subjects.isEmpty()) {
            return "No subjects available.";
        }

        int totalScore = 0;
        for (Subject subject : subjects) {
            totalScore += subject.getScore();
        }

        double average = totalScore / (double) subjects.size();

        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

// Main class to demonstrate the functionality
public class SchoolResultsApp {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Mousam Bathre");

        // Add subjects and their scores
        student.addSubject(new Subject("Math", 95));
        student.addSubject(new Subject("Science", 88));
        student.addSubject(new Subject("English", 76));

        // Calculate and display the grade
        String grade = GradeCalculator.calculateGrade(student);
        System.out.println("Student: " + student.getName());
        
	}
}