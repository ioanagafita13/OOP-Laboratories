package lab1.task2;

public class Course {
    private String title; // numele cursului, de tip string
    private String description; // descrierea cursului, de tip string

    private Student[] students = new Student[10]; // lista de studenti de tip Array (am alocat memorie pt 10 studenti)

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student[] getStudents() {

        return students;
    }

    public void setStudents(Student[] students) {

        this.students = students;
    }

    public void setStudents(Student s1, Student s2, Student s3) {
    }

}
