package com.kuro4king.practice2.Ex2;

public class FindDuplicates {

    FindDuplicates(int[] array) {
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

        // Поиск дубликатов
        for (int i = 0; i < array.length; i++) {
            int k = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (k == array[j]) {
                    dupNumber = k;
                    result = true;
                    countDup++;
                }
            }
            if (result) break;
        }
        showArray(array);

        System.out.println("Result: " + result);

        if (result)
            System.out.println("Число " + dupNumber + " повторяется " + countDup + " раза");
        else System.out.println("Дубликатов нет");

        System.out.println();
    }
}
