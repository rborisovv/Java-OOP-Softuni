package StudentsSystem;

import java.util.*;

public class StudentSystem {
    private final HashMap<String, Student> students;

    public StudentSystem() {
        this.students = new HashMap<>();
    }

    public void Create(Student student) {
        this.students.putIfAbsent(student.getName(), student);
    }

    public String Show(String name) {
        StringBuilder sb = new StringBuilder();
        if (students.containsKey(name)) {
            Student student = students.get(name);
            sb.append(String.format("%s is %d years old. %s",
                    student.getName(), student.getAge(), getGrade(student)));
        }
        return sb.toString();
    }


    private String getGrade(Student student) {
        String grade;
        if (student.getGrade() >= 5.00) {
            grade = "Excellent student.";
        } else if (student.getGrade() >= 3.50) {
            grade = "Average student.";
        } else {
            grade = "Very nice person.";
        }
        return grade;
    }
}