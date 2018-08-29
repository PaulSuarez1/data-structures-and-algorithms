package whiteboard24;

import org.junit.jupiter.api.Test;
import java.util.*;


import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void mergeTest() {
        int[] input = {35, 24, 31, 29, 17, 48, 6, 38, 7, 4};
        System.out.println("Sample data to sort: " + Arrays.toString(input));

        String expected = Arrays.toString(new int[]{4, 6, 7, 17, 24, 29, 31, 35, 38, 48});

        MergeSort sortTest = new MergeSort();
        sortTest.sort(input, 0, input.length - 1);

        String result = Arrays.toString(MergeSort.printArray(input));

        assertEquals(expected, result);


    }


    @Test
    void sort() {
    }

    @Test
    void printArray() {
    }
}