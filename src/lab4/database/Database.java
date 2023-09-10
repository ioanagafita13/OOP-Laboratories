package lab4.database;

import lab4.people.Student;
import lab4.people.Teacher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Database {
    private final List<Student> students = new ArrayList<>();
    private final List<Teacher> teachers = new ArrayList<>();

    // TODO: make it Singleton -> eager singleton
    private static Database instance = null;

    private static Integer numberofInstances;

    private Database(){

    }
    public static Database getDatabase(){ ///punctul a
        ++numberofInstances;
        if (instance == null){
            instance = new Database();
        }
        return instance;
    }

    public static int getNumberOfInstances() {
        // TODO
        return numberofInstances;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        List<Teacher> newTeachers = new ArrayList<>();
        for (Teacher teacher : teachers){
            List<String> subj = teacher.getSubjects(); //fiecare teacher are o lista de subiecte (in care trebuie sa gasim sub respectiv)
            boolean ok = false;
            for (String s : subj){
                if (s.equals(subject)){
                    ok = true;
                    break;
                }
            }
            if (ok){
                newTeachers.add(teacher);
            }
        }

        //return newTeachers;
        // varianta 2:
        return teachers.stream()
                .filter(teacher -> teacher.getSubjects().stream()
                        .anyMatch(sub -> sub.equals(subject)))
                .collect(Collectors.toList());
    }



    public List<Student> findAllStudents() {
        // punctul d
        return students;
    }

    public List<Teacher> findAllTeachers() {
        // punctul d
        return teachers;
    }

    public List<Student> getStudentsBySubject(String subject) {
        // .....punctul d...........???
//        List<Student> newStudents = new ArrayList<>();
//        for (Student student : students) {
//            if (student.getSubjects().containsKey(subject)) {
//                newStudents.add(student);
//            }
//        }
//        return newStudents;

        return students.stream().filter(student -> student.getSubjects().containsKey(subject))
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsByAverageGrade() {
        for (Student student : students){
            Double res = student.averageGrade();
            student.setTotalGrade(res);
        }
        students.sort(Comparator.comparing(Student::getTotalGrade));
        return students;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        List<Student> newStudents = new ArrayList<>();
        for (Student student : students){
            var subj = student.getSubjects();
            if (subj.containsKey(subject)){
                newStudents.add(student);
            }
        }
        newStudents.sort(Comparator.comparing(o -> o.getSubjects().get(subject)));
        return newStudents;
    }
}
