package _4_Arrays;

import java.util.*;

public class _07_SumOfRow {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n, m; // sizes for the 2D array

        do { // wrong data check
            System.out.println("Input 'n' for rows' count: ");
            n = kb.nextInt();

            System.out.println("Input 'm' for columns' count: ");
            m = kb.nextInt();
        }
        while (n <= 0 || n > 100 || m <= 0 || m > 100);

        // declaring main 2D array
        int[][] array2D = new int[n][m];

        int i, j; // looping variables

        // assigning input data for elements to the array
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.println("Input data for element [" + i + "][" + j + "]: ");
                array2D[i][j] = kb.nextInt();
            }
        }
        // parallel 1D array saving the values of each row's sum of elements
        int[] sumRows = new int[n];

        for (i = 0; i < n; i++) {
            sumRows[i] = 0; // (optional) resetting the value
            for (j = 0; j < m; j++) {
                sumRows[i] += array2D[i][j];
            }
        }

        for (i = 0; i < sumRows.length; i++) {
            System.out.println("Sum of elements on row [" + i + "] = " + sumRows[i]);
        }

        kb.close();
    }
}
