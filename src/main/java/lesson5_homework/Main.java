package lesson5_homework;

import java.util.Arrays;

public class Main {

    private static final int size = 10000000;
    private static final int h = size / 2;
    private static float[] arr = new float[size];

    public static void main(String[] args) {
        arrInit();
        method1(arr);
    }

    private static void method1(float[] arr) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        long time = System.currentTimeMillis() - start;

        System.out.println(time);
    }

    private static void method2(float[] arr) {
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        new Thread();

        long start = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        long time = System.currentTimeMillis() - start;

        System.out.println(time);
    }

    private static void arrInit() {
        for (int i = 0; i < size; i++) {
            arr[i] = 1f;
        }
    }
}

