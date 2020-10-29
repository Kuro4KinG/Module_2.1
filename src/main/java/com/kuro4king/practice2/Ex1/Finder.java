package com.kuro4king.practice2.Ex1;

public class Finder {
    private int firstIndex;
    private int secondIndex;

    // Конструктор класса Finder
    Finder(int[] array, int number) {
        findIndexes(array, number);
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

    // Метод находит искомые индексы и выводит их
    private void findIndexes(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            int k = number - array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == k) {
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        }
        showArray(array);
        System.out.println("Number = " + number);
        System.out.println("Result = [" + firstIndex + "," + secondIndex + "]");
        System.out.println();
    }


}
