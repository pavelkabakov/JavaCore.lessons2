package ru.gb.inverse;


import java.util.Arrays;
import java.util.stream.IntStream;

public class main {
//    Вариант 1: Использование XOR
    public static void invertArrayXOR(int[]array){
        for(int i=0;i<array.length;i++){
            array[i]^=1; // XOR с 1 инвертирует бит
        }
    }
//    Вариант 2: Использование арифметических операций
    public static void invertArrayArithmetic(int[]array){
        for(int i=0;i<array.length;i++){
            array[i]=1-array[i];
        }
    }
//    Вариант 3: Использование битового NOT
    public static void invertArrayBitwiseNOT(int[]array){
        for(int i=0;i<array.length;i++){
            array[i]=~array[i]&1;
        }
    }
//    Вариант 4: Использование тернарного оператора (хотя это и не совсем "без ветвлений")
    public static void invertArrayTernary(int[]array){
        for(int i=0;i<array.length;i++){
            array[i]=array[i]==0?1:0;
        }
    }
//    Вариант 5: Использование Stream API (Java 8 и выше)
    public static void invertArrayStream(int[]array){
        IntStream.range(0,array.length).forEach(i->array[i]^=1);
    }

    public static void main(String[]args){
        int[]array={0,1,0,1,1,0};

        System.out.println("Original Array: "+ Arrays.toString(array));

        // Выберите любой метод для тестирования
        invertArrayXOR(array);

        System.out.println("Inverted Array: "+Arrays.toString(array));
    }
}
