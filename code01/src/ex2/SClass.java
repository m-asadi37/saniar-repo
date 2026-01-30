package ex2;

import java.util.List;

public class SClass {

    private String code;
    private Teacher teacher;
    private Student[] students;
//    private List<Student> students;

    public SClass(int studentCount) {
        students = new Student[studentCount];
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void removeStudent(int code) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getCode() == code) {
                students[i] = null;
                break;
            }
        }
    }

    private void setStudents(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void print() {
        System.out.printf("code='%s', teacher name=%s, students: %n",
                code, teacher.getName());
        for (Student student : students) {
            if (student != null)
                System.out.println("\t" + student.getName());
        }
    }
}
