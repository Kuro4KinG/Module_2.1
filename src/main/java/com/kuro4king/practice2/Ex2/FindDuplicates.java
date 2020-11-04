package com.kuro4king.practice2.Ex2;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

    FindDuplicates(int[] array) {
        findDup(array);
    }

    // Метод проверяет массив на наличие дубликатов
    private boolean findDup(int[] array) {
        Set set = new HashSet();

        for (int j : array) {
            if (!set.add(j))
                return true;
        }
        return false;
    }
}
