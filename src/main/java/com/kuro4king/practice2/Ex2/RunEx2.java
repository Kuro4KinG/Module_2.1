package com.kuro4king.practice2.Ex2;

public class RunEx2 {
    public static void main(String[] args) {
        int[] array1 = new int[]{4, 5, 6, 6, 8};
        int[] array2 = new int[]{4, 5, 6, 7, 8};
        int[] array3 = new int[]{4, 5, 4, 7, 8, 4, 4};

        FindDuplicates fd1 = new FindDuplicates(array1);
        FindDuplicates fd2 = new FindDuplicates(array2);
        FindDuplicates fd3 = new FindDuplicates(array3);
    }
}
