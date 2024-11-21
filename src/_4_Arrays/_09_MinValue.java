package _4_Arrays;

import java.util.*;

public class _09_MinValue {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n, m; // sizes for the 2D array

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
                System.out.println("Input data for element [" + i + "][" + j + "]: ");
                arrayTwoD[i][j] = kb.nextDouble();
            }
        }
        // parallel array saving minimal value per a row
        double[] minValues = new double[n];

        for (i = 0; i < n; i++) {
            // assigning the first value to most minimal
            minValues[i] = arrayTwoD[i][0];

            for (j = 0; j < m; j++) {
                // comparing other elements with min value found before
                if (arrayTwoD[i][j] < minValues[i]) {
                    minValues[i] = arrayTwoD[i][j];
                }
            }
        }

        for (i = 0; i < minValues.length; i++) {
            System.out.println("Min value on row [" + i + "] = " + minValues[i]);
        }

        kb.close();
    }
}
