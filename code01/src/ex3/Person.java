package ex3;

public class Person {

    private String name;
    private String family;
    private Person father;

    public Person(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getFather() {
        return father;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void print() {
        System.out.println("Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", father=" + father.getName() + '}'
        );
    }
}
