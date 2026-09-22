package org.example.pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SampleDataGenerator {

    private static final Random RANDOM = new Random();
    private static final String[] FIRST_NAMES = {
            "Ali", "Reza", "Sara", "Maryam", "Hassan", "Fatemeh", "Amir", "Zahra",
            "Mohammad", "Narges", "Hossein", "Leila", "Mehdi", "Elaheh", "Saeed",
            "Parisa", "Behrouz", "Shirin", "Kamran", "Mina", "Farhad", "Nazanin",
            "Arash", "Mahsa", "Babak", "Roya", "Kaveh", "Sepideh", "Pouya", "Azadeh"
    };
    private static final String[] LAST_NAMES = {
            "Ahmadi", "Rezaei", "Hosseini", "Karimi", "Mohammadi", "Sadeghi",
            "Jafari", "Rahimi", "Ebrahimi", "Nazari", "Moradi", "Bagheri",
            "Salehi", "Ghasemi", "Kazemi", "Yousefi", "Sharifi", "Amini",
            "Fazeli", "Norouzi", "Zamani", "Akbari", "Rostami", "Fallahi", "Hasani"
    };

    public static List<Person> generatePersons(int count) {
        List<Person> persons = new ArrayList<>();
        int accountIdCounter = 1;

        for (int i = 1; i <= count; i++) {
            Person person = new Person();
            person.setId(i);
            person.setName(FIRST_NAMES[RANDOM.nextInt(FIRST_NAMES.length)]);
            person.setFamily(LAST_NAMES[RANDOM.nextInt(LAST_NAMES.length)]);
            person.setAge(18 + RANDOM.nextInt(63)); // 18..80

            int accountCount = RANDOM.nextInt(6); // 0..5
            for (int j = 0; j < accountCount; j++) {
                BankAccount account = new BankAccount();
                account.setId(accountIdCounter++);
                account.setBalance(Math.round(RANDOM.nextDouble() * 100_000_00) / 100.0); // 0..100,000.00
                account.setBank(Bank.values()[RANDOM.nextInt(Bank.values().length)]);
                person.getBankAccounts().add(account);
            }

            persons.add(person);
        }

        return persons;
    }

}