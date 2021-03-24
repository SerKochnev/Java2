package lesson_03_homework;

import java.util.*;

public class Phonebook {
    private final Map<String, Set<Integer>> book = new HashMap<>();

    void add(String lastName, int phone) {
        Set<Integer> set = book.get(lastName);
        if (set != null) {
            set.add(phone);
        } else {
            set = new HashSet<>();
            set.add(phone);
            book.put(lastName, set);
        }
    }

    void get(String lastName) {
        book.get(lastName).forEach(System.out::println);
    }
}
