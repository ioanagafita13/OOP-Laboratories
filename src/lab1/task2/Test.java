package lab1.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String []args){



    Integer year = Integer.valueOf(args[0]);

    Student s1 = new Student();
    s1.setName("Ioana Gafita");
    s1.setYear(3);

    Student s2 = new Student();
    s2.setName("Mihai Popescu");
    s2.setYear(3);

    Student s3 = new Student();
    s3.setName("Eva Ionescu");
    s3.setYear(4);

    Student s4 = new Student();
    s4.setName("Oprea Marius");
    s4.setYear(4);

    Course JavaIntro = new Course();
    JavaIntro.setDescription("Familiarizare cu OOP");
    JavaIntro.setTitle("First Steps");
    JavaIntro.setStudents(s1, s2, s3);

    //rezolvare task 4

//        String a = "Alex";
//        String b = new String("Alex");

//        System.out.println(a.equals(b));

    Student st1 = new Student();
    st1.setName("Alex");
    st1.setYear(1);
    Student st2 = new Student();
    st2.setName("Alex");
    st2.setYear(1);
    System.out.println(st1.equals(st2));


//        Student[] students = new Student[4];
//        students[0] = s1;
//        students[1] = s2;
//        students[2] = s3;
//        students[3] = s4;
//        Student[] finalStudents = Student.filterStudentsPrimitive(students, year);
//        System.out.println(Arrays.toString(finalStudents));

    List<Student> students = new ArrayList<>();
    students.add(s1);
    students.add(s2);
    students.add(s3);
    students.add(s4);
    List<Student> finalStudents = new ArrayList<>();
    finalStudents = Student.filterStudents(students, year);
//        System.out.println(finalStudents);
}
}
