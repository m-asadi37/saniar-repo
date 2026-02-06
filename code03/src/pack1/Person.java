package pack1;

public class Person {

    private int id;
    private static int count;

    static {
        System.out.println("static block...");
        count = 5;
    }

    public Person() {
        //a = b++;
        //1-> a = b
        //2-> b = b+1

        //a = ++b;
        //1-> b = b+1
        //2-> a = b
        this.id = ++count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public static void display() {
        System.out.println("count= " + count);
    }

    public void display2() {
        System.out.println("id=" + id + " ,count=" + count);
    }
}
