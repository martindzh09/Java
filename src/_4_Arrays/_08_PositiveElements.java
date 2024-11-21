package _4_Arrays;

import java.util.*;

public class _08_PositiveElements {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n, m; // sizes for the array

        do {
            System.out.println("Input data for rows 'n': ");
            n = kb.nextInt();

            System.out.println("Input data for columns 'm': ");
            m = kb.nextInt();
        }
        while (n <= 0 || n > 100 || m <= 0 || m > 100);

        double[][] arrayTwoD = new double[n][m];

        int i, j; // looping variables

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.println("Input data for an element [" + i + "][" + j + "]: ");
                arrayTwoD[i][j] = kb.nextDouble();
            }
        }
        // parallel array for positive elements on a row
        int[] positiveElementsRow = new int[n];

        for (i = 0; i < n; i++) {
            positiveElementsRow[i] = 0;

            for (j = 0; j < m; j++) {
                // each element is a counter for the positive numbers found
                if (arrayTwoD[i][j] > 0) {
                    positiveElementsRow[i]++;
                }
            }
        }

        for (i = 0; i < n; i++) {
            System.out.println("Count of positive elements on row [" + i + "] = " + positiveElementsRow[i]);
        }

        kb.close();
    }
}
