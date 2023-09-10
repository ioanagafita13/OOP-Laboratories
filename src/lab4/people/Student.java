package lab4.people;

import lab4.database.Database;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
    private String firstName;
    private String lastName;
    private Map<String, Integer> subjects;
    private Double totalGrade;

    public Student(String firstName, String lastName, Map<String, Integer> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    // TODO: copy constructor
    public Student (Student student){
        this.firstName = student.firstName;
        this.lastName = student.lastName;
        subjects = new HashMap<>();
        //se trece prin toata lista subjects si se pun noi valori.
        subjects.putAll(student.subjects);//echivalentul lui for each
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setTotalGrade (Double totalGrade){
        this.totalGrade = totalGrade;
    }
    public Double getTotalGrade() {
        return totalGrade;
    }

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(HashMap<String, Integer> subjects) {
        this.subjects = subjects;
    }

    public double averageGrade() { //....punctul b...................
        // TODO
       double averageGrade = 0;
        for (Map.Entry<String, Integer> entry : subjects.entrySet()){
            averageGrade += entry.getValue();
        }
        averageGrade /= subjects.size();
        return averageGrade;
    }

    public List<Teacher> getAllTeachers() {
        // TODO
        return Collections.unmodifiableList(Database.getDatabase().findAllTeachers());
    }

    public int getGradeForSubject(String subject) { //.....punctul b........??
        return subjects.get(subject);
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        // TODO
        return Collections.unmodifiableList(Database.getDatabase().findTeachersBySubject(subject));
    }

    public List<Student> getAllStudents() {
        // TODO
        return Collections.unmodifiableList(Database.getDatabase().findAllStudents());
    }

    public List<Student> getStudentsBySubject(String subject) {
        // TODO
        return Collections.unmodifiableList(Database.getDatabase().getStudentsBySubject(subject));
    }

    public List<Student> getStudentsByAverageGrade() {
        // TODO
        return Collections.unmodifiableList((Database.getDatabase().getStudentsByAverageGrade()));
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        // TODO
        return Collections.unmodifiableList(Database.getDatabase().getStudentsByGradeForSubject(subject));
    }
}
