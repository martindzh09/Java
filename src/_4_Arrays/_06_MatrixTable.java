package _4_Arrays;

public class _06_MatrixTable {
    public static void main(String[] args) {

        int[][] twoD = new int[3][5];
        // int twoD[][] = new int[][]; - C-style syntax

        int i, j; // looping variables

        // assigning values to the array
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = 0; // array is assigned a value for an exact position
                // [(rows)][(columns)] - coordinates
            }
        }

        // printing the values from the array
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print("element [" + i + "][" + j + "] = " + twoD[i][j] + "\t");
            }
            System.out.println(); // next line when printing all values per current row iterated
        }

    }
}
