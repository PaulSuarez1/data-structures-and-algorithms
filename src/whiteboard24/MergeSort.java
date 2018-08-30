package whiteboard24;

public class MergeSort {

//    // this whiteboard is brought to you by: http://www.java2novice.com/java-sorting-algorithms/merge-sort/
//    //
//
//    private int[] array;
//    private int[] tempArray;
//    private int length;
//
//    public static void mergeSort(String a[]) { // not exactly sure what to pass into this method.
//
//        // creating testing array for now
//        int[] inputArr = {35,24,31,29,17,48,6,38,6,4};
//        MergeSort newMerge = new MergeSort();
//        newMerge.sort(inputArr);
//        for(int i : inputArr) {
//            System.out.println(i);
//            System.out.println(" ");
//        }
//    }
//
//    public static void sort(int inputArr[]) {
//        this.array = inputArr;
//        this.length = inputArr.length;
//        this.tempArray = new int[length];
//        sorting(0, length - 1);
//    }
//
//    private void sorting (int low, int high) {
//
//        if (low < high) {
//            int middle = low + (high - low) / 2;
//            sorting(low, middle);
//            sorting(middle + 1, high);
//            mergeAll(low, middle, high);
//        }
//    }
//
//    private void mergeAll(int low, int middle, int high) {
//
//        for (int i = low; i <= high; i++) {
//            tempArray[i] = array[i];
//        }
//
//        int i = low;
//        int j = middle + 1;
//        int k = low; // why this is declared twice I have no idea.
//
//        while (i <= middle && j <= high) {
//            if (tempArray[i] <= tempArray[j]) {
//                array[k] = tempArray[i];
//                i++;
//            } else {
//                array[k] = tempArray[j];
//                j++;
//            }
//            k++;
//        }
//
//    }

    // ok, well that didn't work. Here's to trying again:

    public void merge (int arr[], int low, int middle, int high) {
        extract(arr, low, middle, high);
    }
    // my intelliJ freaked out and made me add the above when I brought my reworked class in from the selection merge sort.
    // test works like it did before but

    public static void extract(int[] arr, int low, int middle, int high) {
        int n1 = middle - low + 1;
        int n2 = high - middle;

        int left[] = new int [n1];
        int right[] = new int [n2];

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

    // the below still sees this as a duplicate from SelectionMergeSort because I use the same mergeSort for both whitebaords.
    public void sort (int arr[], int lowest, int highest) {
        if (lowest < highest) {

            int middle = (lowest + highest) / 2;

            sort(arr, lowest, middle);
            sort(arr , middle + 1, highest);

            merge(arr, lowest, middle, highest);
        }
    }

    public static int[] printArray (int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        return arr;
    }
}
