package whiteboard25;

public class SelectionMergeSort {

    // merge sort from previous whiteboard.
    // About to write out the selection sort method and a comparison.

    public void merge (int arr[], int low, int middle, int high) {
        int n1 = middle - low + 1;
        int n2 = high - middle;

        int left[] = new int [n1];
        int right[] = new int [n2];

    /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) {
            left[i] = arr[low + i];
        }
        for (int j = 0; j < n2; ++j) {
            right[j] = arr[middle + 1 + j];
        }

            int i = 0, j = 0;

        int k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
        arr[k] = left[i];
        i++;
        k++;
    }

        while (j < n2) {
        arr[k] = right[j];
        j++;
        k++;
    }
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
