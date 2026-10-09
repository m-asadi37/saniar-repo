package org.example;

import org.example.pack1.Bank;
import org.example.pack1.BankAccount;
import org.example.pack1.Person;
import org.example.pack1.SampleDataGenerator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class App {
    static List<Person> persons = SampleDataGenerator.generatePersons(50);

    public static void main1(String[] args) {

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

    public static void main(String[] args) throws IOException {
        //try - with resource
        File f1 = new File("sample.txt");
        FileWriter fw = new FileWriter(f1);
        persons.stream()
                .filter(person -> !person.getBankAccounts().isEmpty())
                .forEach(person -> {
                    try {
                        fw.append(person + "\n");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
        fw.close();

        Set<String> names = persons.stream()
                .map(Person::getName)
                .collect(Collectors.toSet());
        for (String name : names) {
            System.out.println(name);
        }

        List<String> words = List.of("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");
//        int max = words.getFirst().length();
//        int ind = 0;
//        for (String word : words) {
//            if (word.length() > max) {
//                max = word.length();
//            }
//            ind++;
//        }
//        System.out.println(ind);
        Optional<String> max = words.stream()
                .reduce((w1, w2) -> {
                    if (w1.length() < w2.length()) {
                        return w2;
                    } else
                        return w1;
                });
        if (max.isPresent()) {
            System.out.println(max.get());
        }

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);

        Optional<Integer> sum2 = numbers.stream()
                .reduce((n1, n2) -> n1 + n2);
        System.out.println(sum2);

        boolean b1 = persons.stream()
                .anyMatch(person -> person.getAge() < 0);
        System.out.println(b1);

        boolean b2 = persons.stream()
                .noneMatch(person -> person.getBankAccounts().isEmpty());
        System.out.println(b2);
    }
}
