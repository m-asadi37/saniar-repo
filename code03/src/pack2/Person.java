package pack2;

import java.util.ArrayList;
import java.util.List;

public class Person {

    //1- initialize in constructor with parameter
    public Person(String code, String name) {
        this.code = code;
        this.name = name;
    }

    //2- initialize in constructor with default value
    public Person(String name) {
        this.name = name;
        this.code = "1000";
    }

    //3- inline initialize
    private final List<String> addresses = new ArrayList<>();
    private final String code;
    private String name;

    public String getCode() {
        return code;
    }

//    public void setCode(String code) {
//        this.code = code;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
