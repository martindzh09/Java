package _4_Arrays;

import java.util.*;

public class _16_ArithmeticOperations {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n, m; // rows, columns (sizes input)
        int i, j; // looping variables

        // 1.0 Input data for array's size
        do {
            System.out.println("Input data for rows 'n': ");
            n = kb.nextInt();

            System.out.println("Input data for columns 'm': ");
            m = kb.nextInt();
        }
        while (n <= 0 || m <= 0);

        // 2.0 Input data for elements in the array
        double[][] array = new double[n][m];

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.println("Input element [" + i + "][" + j + "]: ");
                array[i][j] = kb.nextDouble();
            }
        }
        System.out.println();

        // 3.0 Multiplication of elements on each column (m)
        double[] multi = new double[m];

        for (j = 0; j < m; j++) {
            multi[j] = 1; // first value set when next column reached

            for (i = 0; i < n; i++) {
                multi[j] *= array[i][j];
            }
        }

        // 3.1 Print results of multiplication
        System.out.println("I. Multiplication of elements");
        for (j = 0; j < m; j++) {
            System.out.print(multi[j] + "\t");
        }
        System.out.print("\n\n");

        // 4.0 Average value on each row
        double[] avg = new double[n];

        System.out.println("II.");

        for (i = 0; i < n; i++) {
            avg[i] = 0;

            for (j = 0; j < m; j++) {
                avg[i] += array[i][j];
            }

            avg[i] /= m; // average value formula

            System.out.println("Average value [" + i + "] = " + avg[i] + '\t');
        }
        System.out.println("\n" + "III.");

        // 5.0 Minimal and max value and their indexes
        double min = array[0][0], max = array[0][0];

        int indexMinN = 0, indexMinM = 0, indexMaxN = 0, indexMaxM = 0;

        // 5.1 Minimal values
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {

                if (array[i][j] < min) {
                    min = array[i][j];

                    indexMinN = i;
                    indexMinM = j;
                }
            }
        }
        // print (5.1)
        System.out.println("Min value on row [" + i + "] = " + min + ", "
                + "indexes [" + indexMinN + "][" +indexMinM +"]");

        // 5.2 Max values
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {

                if (array[i][j] > max) {
                    max = array[i][j];

                    indexMaxN = i;
                    indexMaxM = j;
                }
            }
        }
        // print (5.2)
        System.out.println("Max value on row [" + i + "] = " + max + ", "
                + "indexes [" + indexMaxN + "][" + indexMaxM + "]" + "\n");

        // 6. Even rows (*3), odd rows (/2)
        System.out.println("IV.");

        // 6.1 Even rows (0, 2,...n)
        for (i = 0; i < n; i += 2) {
            for (j = 0; j < m; j++) {
                array[i][j] *= 3;
            }
        }

        // 6.2 Odd rows (1, 3,...n)
        for (i = 1; i < n; i += 2) {
            for (j = 0; j < m; j++) {
                array[i][j] /= 2;
            }
        }

        // 6.3 Printing results
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print("Element [" + i + "][" + j + "] = " + array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // 7.0 Number 'x' to be found with its index
        System.out.println("V. Input x: ");
        double x = kb.nextDouble();

        boolean xFound = false;

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {

                if (array[i][j] == x) {
                    xFound = true;
                    System.out.println("'x' is found on row " + i + ", column " + j + "\t");
                }
            }
        }

        if (!xFound) {
            System.out.print("'x' is not found!");
        }
        else {
            System.out.print("'x' is already found on printed positions above.");
        }

        kb.close();
    }
}
