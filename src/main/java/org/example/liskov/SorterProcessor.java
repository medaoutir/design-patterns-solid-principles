package org.example.liskov;

public class SorterProcessor {

    static void processSorting(Sort sorter, int[] array) {
        sorter.sort(array);
    }
}
