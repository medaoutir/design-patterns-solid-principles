package org.example.liskov;

import java.util.Arrays;

public class SortClient {

    public static void main(String[] args) {
        int[] array = new int[] {9,10,8,6,11,6,0};
        SorterProcessor.processSorting(new SelectionSort(), array);
        System.out.println("array is finally sorted :"+ Arrays.toString(array));
    }
}
