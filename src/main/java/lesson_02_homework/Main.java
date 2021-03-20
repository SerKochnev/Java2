package lesson_02_homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] test1 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] test2 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "press F to pay respect", "4"}};
        String[][] test3 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

        printResult(test1);
        printResult(test2);
        printResult(test3);
    }

    private static void printResult(String[][] arr) {
        try {
            System.out.println(Arrays.deepToString(testMethod(arr)));
        } catch (MyArrayDataException e) {
            System.out.printf("Numbers, junior java developer, Do You Hear Me?! %s%n%n", e.getMessage());
        } catch (MyArraySizeException e) {
            System.out.printf("Wrong size shall not pass! %s%n%n", e.getMessage());
        }
    }

    private static int[][] testMethod(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        arrLengthCheck(arr);
        return parseToInt(arr);
    }

    private static void arrLengthCheck(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) throw new MyArraySizeException("\nOuter array has wrong size");

        for (String[] array : arr) {
            if (array.length != 4) throw new MyArraySizeException("\nInner array has wrong size");
        }
    }

    private static int[][] parseToInt(String[][] arr) throws MyArrayDataException {
        int[][] result = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    result[i][j] = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            "\nindex of wrong cell: [" + i + "][" + j + "], " +
                                    "\ncell value: \"" + arr[i][j] + "\", \n" +
                                    arr[i][j].getClass());
                }
            }
        }
        return result;
    }
}
