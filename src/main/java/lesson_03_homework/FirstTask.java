package lesson_03_homework;

import java.util.HashMap;
import java.util.Map;

public class FirstTask {
    public static void main(String[] args) {
        String[] arr = "One-one was a race horse. Two-two was one too. One-one won one race. Two-two won one too.".toLowerCase().split(" ");

        printMap(mapInit(arr));
    }

    private static Map<String, Integer> mapInit(String[] arr) {
        Map<String, Integer> map = new HashMap<>();

        for (String e : arr) {
            map.putIfAbsent(e, 0);
            map.put(e, map.get(e) + 1);
        }
        return map;
    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
