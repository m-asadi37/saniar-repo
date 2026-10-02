package org.example;

import org.example.pack1.Bank;
import org.example.pack1.BankAccount;
import org.example.pack1.Person;
import org.example.pack1.SampleDataGenerator;

import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Person> persons = SampleDataGenerator.generatePersons(50);

        persons.stream()
                .filter(person -> !person.getBankAccounts().isEmpty())
                .map(person -> person.getName() + " " + person.getFamily())
                .forEach(System.out::println);

        System.out.println("****************");
        persons.stream()
                .map(person -> person.getName() + " " + person.getFamily())
                .filter(str -> str.length() > 10)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("****************");
        persons.stream()
//                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .sorted(Comparator.comparingInt(Person::getAge))
                .map(person ->
                        String.format("%02d %02d", person.getId(), person.getAge()))
                .forEach(System.out::println);

        System.out.println("****************");
        persons.stream()
                .map(Person::getAge)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("****************");
        persons.stream()
                .filter(person -> person.getBankAccounts().isEmpty())
                .peek(person ->
                        person.getBankAccounts().add(new BankAccount(1, 10000, Bank.BLUE)))
                .forEach(System.out::println);

        System.out.println("****************");
        persons.stream()
                .flatMap(person -> person.getBankAccounts().stream()
                        .filter(bankAccount -> bankAccount.getBank().equals(Bank.BLUE)))
                .forEach(System.out::println);
    }
}
