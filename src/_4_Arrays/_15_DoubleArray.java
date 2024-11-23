package _4_Arrays;

import java.util.*;

public class _15_DoubleArray {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n, m; // array's sizes

        do {
            System.out.println("Input 'n' for rows' size: ");
            n = kb.nextInt();

            System.out.println("Input 'm' for columns' size: ");
            m = kb.nextInt();
        }
        while (n <= 0 || n > 100 || m <= 0 || m > 100);

        int i, j; // looping variables

        double[][] array = new double[n][m];

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.println("Input data for element [" + i + "][" + j + "]: ");
                array[i][j] = kb.nextDouble();
            }
        }
        // parallel 1D array, needed to save the sum of elements of each row
        double[] sumRows = new double[n];

        // - || - , average value of each column*
        double[] averageColumn = new double[m];

        // - || - , minimal value of each row
        double[] minNum = new double[n];

        for (i = 0; i < n ; i++) {
            minNum[i] = array[i][0];

            for (j = 0; j < m; j++) {
                sumRows[i] += array[i][j];

                // *'j' is used for columns
                averageColumn[j] += array[i][j];

                if (array[i][j] < minNum[i]) {
                    minNum[i] = array[i][j];
                }
            }
        }

        System.out.println("I. Sum of elements");
        for (i = 0; i < sumRows.length; i++) {

            if (i == (sumRows.length - 1)) {
                System.out.print("row [" + i + "] = " + sumRows[i] + "\n\n");
            }
            else {
                System.out.print("row [" + i + "] = " + sumRows[i] + "\t");
            }
        }

        System.out.println("II. Average value");
        for (j = 0; j < averageColumn.length; j++) {
            averageColumn[j] /= m;

            if (j == (averageColumn.length - 1)) {
                System.out.print("column [" + j + "] = " + averageColumn[j] + "\n\n");
            }
            else {
                System.out.print("column [" + j + "] = " + averageColumn[j] + "\t");
            }
        }

        System.out.println("III. Min value");
        for (i = 0; i < minNum.length; i++) {

            if (i == (minNum.length - 1)) {
                System.out.print("row [" + i + "] = " + minNum[i] + "\n");
            }
            else {
                System.out.print("row [" + i + "] = " + minNum[i] + "\t");
            }
        }

        kb.close();
    }
}
