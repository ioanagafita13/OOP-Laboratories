package lab1.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class Student {
        private String name;
        private Integer year;

        public String getName() {

            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public Integer getYear() {

            return year;
        }

        public void setYear(Integer year) {

            this.year = year;
        }

//    public static Student[] filterStudentsPrimitive(Student[] students, Integer year) {
//        int nr = 0;
//        for (Student student : students) {
//            if (student.getYear().equals(year)) {
//                ++nr;
//            }
//        }
//        Student[] students1 = new Student[nr];
//        int i = 0;
//        for (Student student : students) {
//            if (student.getYear().equals(year)) {
//                students1[i] = student;
//                ++i;
//            }
//        }
//
//        return students1;
//    }

        public static List<Student> filterStudents(List<Student> students, Integer year) {
//        List<Student> students1 = new ArrayList<>();
//        for (Student student : students) {
//            if (student.getYear().equals(year)) {
//                students1.add(student);
//            }
//        }
//        return students1;
            return students.stream()
                    .filter(student -> student.getYear().equals(year))
                    .collect(Collectors.toList());
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", year=" + year +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) && Objects.equals(year, student.year);
        }

}
