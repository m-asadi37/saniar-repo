package pack1;

public /*final*/ class Person {

    private String name;
    private String code;

    public Person(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void doWork() {
        System.out.println("do work....");
    }

    public final void doPersonalWork() {
        System.out.println("do personal work....");
    }
}
