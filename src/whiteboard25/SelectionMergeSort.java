package whiteboard25;

import whiteboard24.MergeSort;

public class SelectionMergeSort {

    // merge sort from previous whiteboard.
    // About to write out the selection sort method and a comparison.

    public void merge (int arr[], int low, int middle, int high) {
        MergeSort.extract(arr, low, middle, high);
    }


    public void sort (int arr[], int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;

            sort(arr, low, middle);
            sort(arr , middle + 1, high);

            merge(arr, low, middle, high);
        }
    }

    public static int[] printArray (int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        return arr;
    }


    // Selection sort:
    public void sort (int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public void printArraySelection (int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    // comparison
}
