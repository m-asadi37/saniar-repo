package org.example.pack1;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

//@Data
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"id"})
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private String family;
    private int age;
    private final List<BankAccount> bankAccounts = new ArrayList<>();

    //this      10
    //person o  14
    @Override
    public int compareTo(Person o) {
        return this.id - o.id;
    }
}
