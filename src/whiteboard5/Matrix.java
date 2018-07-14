package whiteboard5;

import.java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {
        int[][] aa = {{1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}};
    }



    public static int[][] Matrix(int[][] aa) {
        int rowLength = aa.length;
        int colLength = aa[0].length;

        int[][] result = new int[rowLength][colLength];

        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {

                result[col][rowLength - 1 - row] = aa[row][col];
            }
        }
        return result;
    }
}

