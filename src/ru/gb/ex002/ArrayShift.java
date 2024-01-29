package ru.gb.ex002;

import java.util.Arrays;

public class ArrayShift {

    public static void cyclicShift(int[] array, int n) {
        if (array == null || array.length == 0) return;

        int length = array.length;
        n = n % length; // Нормализация n
        if (n < 0) { // Для отрицательного сдвига
            n += length;
        }

        reverse(array, 0, length - 1);
        reverse(array, 0, n - 1);
        reverse(array, n, length - 1);
    }

    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int shift = 4;

        System.out.println("Original array: " + Arrays.toString(array));
        cyclicShift(array, shift);
        System.out.println("Shifted array: " + Arrays.toString(array));
    }
}

