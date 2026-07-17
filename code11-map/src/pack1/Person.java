package pack1;

public class Person implements Comparable<Person> {

    private static int count;
    int id;
    String name;

    public Person(String name) {
        //id = ++count;
        //count = count + 1;
        //id = count;

        //id = count++;
        //id = count;
        //count = count + 1;

        this.id = ++count;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //this      : current object
    //person o  : input arg
    @Override
    public int compareTo(Person o) {
        return this.id - o.id;
    }
}
