package lesson_03_homework;

import java.util.*;

public class Phonebook {
    private final Map<String, List<Integer>> book = new HashMap<>();

    void add(String lastName, int phone) {
        List<Integer> list = book.get(lastName);
        if (list != null) {
            list.add(phone);
        } else {
            list = new ArrayList<>();
            list.add(phone);
            book.put(lastName, list);
        }
    }

    void get(String lastName) {
        book.get(lastName).forEach(System.out::println);
    }
}
