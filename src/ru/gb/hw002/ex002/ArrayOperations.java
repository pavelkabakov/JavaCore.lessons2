package ru.gb.hw002.ex002;

//Написать функцию, возвращающую разницу между самым большим и самым ма-
//        леньким элементами переданного не пустого массива.

public class ArrayOperations {
    public static int findDifference(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        int max = array[0]; // Инициализируем максимальное значение первым элементом массива
        int min = array[0]; // Инициализируем минимальное значение также первым элементом массива

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Обновляем максимальное значение, если находим больший элемент
            } else if (array[i] < min) {
                min = array[i]; // Обновляем минимальное значение, если находим меньший элемент
            }
        }

        return max - min; // Возвращаем разницу
    }

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1, 2, 3, 4, 5})); // → 4 (5 - 1)
        System.out.println(findDifference(new int[]{15, 22, 8, 19, 31})); // → 23 (31 - 8)
        System.out.println(findDifference(new int[]{7})); // → 0 (7 - 7)
    }
}

