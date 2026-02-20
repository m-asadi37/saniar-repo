package pack1;

public class Student extends Person {

    public void test() {
        System.out.println("test...");
    }

    //Override: بازنویسی متد
    //@ : Annotation
    @Override
    public void doWork() {
        System.out.println("Learning ...");
    }
}
