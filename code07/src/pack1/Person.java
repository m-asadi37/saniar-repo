package pack1;

import java.util.Objects;

public class Person {

    public Person(String name, String code) {
        this.name = name;
        this.code = code;
    }

    private String name;
    private String code;

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

    @Override
    public String toString() {
        return "Person{name='%s', code='%s'}".formatted(name, code);
    }

    @Override
    public boolean equals(Object obj) {
        //this (p1) : current object
        //obj       : equals method parameter

        //reference check
        if (this == obj) return true;

        //null check
        if (obj == null) return false;

        //type check
        if (this.getClass() != obj.getClass()) return false;

        //custom equalization
        Person other = (Person) obj;
        return (this.code.equals(other.code));
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(code);
        return result;

        // |-98| = 98
        // |+98| = 98
    }
}
