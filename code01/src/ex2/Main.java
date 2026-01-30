package ex2;

public class Main {

    public static void main(String[] args) {
        SClass sc1 = new SClass(5);
        sc1.setCode("java 7010");

        Teacher teacher = new Teacher();
        teacher.setName("mohammad");

        Student student = new Student();
        student.setName("saniar");
        student.setCode(1);

        sc1.setTeacher(teacher);
        sc1.addStudent(student);

        SClass sc2 = new SClass(2);
        sc2.setCode("java 9010");

        Student student2 = new Student();
        student2.setName("bahar");
        student2.setCode(2);

        sc2.setTeacher(teacher);
        sc2.addStudent(student);
        sc2.addStudent(student2);

        sc1.print();
        sc2.print();

        sc1.removeStudent(1);
        sc1.print();
//        sc2.setStudents(new Student[]{student, student2});
    }

    public static void main2(String[] args) throws InterruptedException {
        String str = "hello java";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            Thread.sleep(1000);
        }
    }
}
