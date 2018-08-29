package whiteboard24;

public class MergeSort {

    private int[] array;
    private int[] tempArray;
    private int length;

    public static void mergeSort() {

        // creating testing array for now
        int[] inputArr = {35,24,31,29,17,48,6,38,6,4};
        MergeSort newMerge = new MergeSort();
        newMerge.sort(inputArr);
        for(int i : inputArr) {
            System.out.println(i);
            System.out.println(" ");
        }

    }

    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempArray = new int[length];
        sorting(0, length - 1);
    }

    private void sorting (int low, int middle, int high) {
        
    }

}
