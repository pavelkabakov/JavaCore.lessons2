package ru.gb.hw002.ex001;


//Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3
//countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0


public class ArrayUtils {
    public static int countEvens(int[] array) {
        int count = 0; // Счетчик четных чисел
        for (int num : array) {
            if (num % 2 == 0) {
                count++; // Увеличиваем счетчик, если число четное
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4})); // → 3
        System.out.println(countEvens(new int[]{2, 2, 0})); // → 3
        System.out.println(countEvens(new int[]{1, 3, 5})); // → 0
    }
}

