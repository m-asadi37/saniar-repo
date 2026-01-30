package ex3;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("ali","ahmadi");
        Person p2 = new Person("ahamd", "ahmadi");
        p2.setFather(p1);
        p2.print();
    }
}
