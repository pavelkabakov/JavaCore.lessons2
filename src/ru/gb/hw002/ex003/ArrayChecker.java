package ru.gb.hw002.ex003;

//Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.

public class ArrayChecker {
    public static boolean hasConsecutiveZeros(int[] array) {
        // Проверяем, достаточно ли длинный массив для поиска пары
        if (array == null || array.length < 2) {
            return false;
        }

        for (int i = 0; i < array.length - 1; i++) {
            // Проверяем наличие пары нулевых элементов
            if (array[i] == 0 && array[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasConsecutiveZeros(new int[]{1, 0, 0, 3})); // → true
        System.out.println(hasConsecutiveZeros(new int[]{0, 1, 2, 0})); // → false
        System.out.println(hasConsecutiveZeros(new int[]{1, 2, 3})); // → false
    }
}

