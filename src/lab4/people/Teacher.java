package lab4.people;

import lab4.database.Database;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String firstName;
    private String lastName;
    private List<String> subjects;

    public Teacher(String firstName, String lastName, List<String> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    // TODO: copy constructor ...............punctul c
    public Teacher (Teacher teacher){
        firstName = teacher.firstName; //nu e neaparat necesar "this" pt ca nu avem param in paranteza cu acelasi nume, ca sa fie riscul de confuzie
        lastName = teacher.lastName;
        subjects = new ArrayList<>(); //alocam memorie pt o lista
        subjects.addAll(teacher.subjects); // echivalentul lui for each
    }

    @Override
    public String toString() {
        return "Teacher: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
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

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<Teacher> getAllTeachers() {
        // TODO
        return Database.getDatabase().findAllTeachers();
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        // TODO
        return Database.getDatabase().findTeachersBySubject(subject);
    }

    public List<Student> getAllStudents() {
        // TODO
        return Database.getDatabase().findAllStudents();
    }

    public List<Student> getStudentsBySubject(String subject) {
        // TODO
        return Database.getDatabase().getStudentsBySubject(subject);
    }

    public List<Student> getStudentsByAverageGrade() {
        // TODO
        return Database.getDatabase().getStudentsByAverageGrade();
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        // TODO
        return Database.getDatabase().getStudentsByGradeForSubject(subject);
    }
}
