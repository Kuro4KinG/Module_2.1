package com.kuro4king.practice2.Ex2;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

    FindDuplicates(int[] array) {
        showArray(array);
        findDup(array);
    }

    // Метод выводит массив
    private void showArray(int[] array) {
        System.out.print("Array = [ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    // Метод ищет дубликаты в массиве и выводит их на экран
    private void findDup(int[] array) {
        boolean result = false;
        int countDup = 1;
        int dupNumber = 0;
        Set set = new HashSet();

        // Поиск дубликатов
        for (int j : array) {
            if (!set.add(j)) {
                result = true;
                dupNumber = j;
                countDup++;
            }
        }
        System.out.println("Result: " + result);
        if (result)
            System.out.println("Число " + dupNumber + " повторяется " + countDup + " раза.");
        else System.out.println("Дубликатов нет");
        System.out.println();

    }
}
