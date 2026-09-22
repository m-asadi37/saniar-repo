package org.example;

import org.example.pack1.Person;
import org.example.pack1.SampleDataGenerator;

import java.util.List;


public class App {

    public static void main(String[] args) {
        List<Person> persons = SampleDataGenerator.generatePersons(50);

        persons.stream()
                .map(person -> (person.getName() + " " + person.getFamily()))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
