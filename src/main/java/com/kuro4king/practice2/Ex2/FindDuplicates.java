package com.kuro4king.practice2.Ex2;

import java.util.*;

public class FindDuplicates {

    FindDuplicates(int[] array) {
        findDup(array);
    }

    private boolean findDup(int[] array) {
        Set set = new HashSet();

        for (int j : array) {
            if (!set.add(j))
                return true;
        }
        return false;

    }
}
