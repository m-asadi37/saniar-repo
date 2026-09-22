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
public class Person {
    private int id;
    private String name;
    private String family;
    private int age;
    private final List<BankAccount> bankAccounts = new ArrayList<>();

}
